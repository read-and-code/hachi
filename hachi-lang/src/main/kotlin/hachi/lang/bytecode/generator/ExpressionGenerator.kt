package hachi.lang.bytecode.generator

import hachi.lang.domain.expression.Call
import hachi.lang.domain.expression.ConditionalExpression
import hachi.lang.domain.expression.ConstructorCall
import hachi.lang.domain.expression.EmptyExpression
import hachi.lang.domain.expression.FunctionCall
import hachi.lang.domain.expression.FunctionParameter
import hachi.lang.domain.expression.SuperCall
import hachi.lang.domain.expression.Value
import hachi.lang.domain.expression.VariableReference
import hachi.lang.domain.math.Addition
import hachi.lang.domain.math.ArithmeticExpression
import hachi.lang.domain.math.Division
import hachi.lang.domain.math.Multiplication
import hachi.lang.domain.math.Subtraction
import hachi.lang.domain.scope.Scope
import hachi.lang.exception.BadArgumentsToFunctionCallException
import hachi.lang.util.DescriptorFactory
import hachi.lang.util.TypeChecker
import hachi.lang.util.TypeResolver
import jdk.internal.org.objectweb.asm.Label
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class ExpressionGenerator(private val methodVisitor: MethodVisitor, val scope: Scope) {
    fun generate(variableReference: VariableReference) {
        val variableName = variableReference.variableName
        val index = this.scope.getLocalVariableIndex(variableName)
        val localVariable = this.scope.getLocalVariable(variableName)
        val type = localVariable.type

        this.methodVisitor.visitVarInsn(type.getLoadOpcode(), index)
    }

    fun generate(functionParameter: FunctionParameter) {
        val type = functionParameter.getType()
        val index = this.scope.getLocalVariableIndex(functionParameter.name)

        this.methodVisitor.visitVarInsn(type.getLoadOpcode(), index)
    }

    fun generate(value: Value) {
        val type = value.getType()
        val stringValue = value.value
        val transformedValue = TypeResolver.getValueFromString(stringValue, type)

        this.methodVisitor.visitLdcInsn(transformedValue)
    }

    fun generate(constructorCall: ConstructorCall) {
        val ownerDescriptor = this.scope.getClassInternalName()

        this.methodVisitor.visitTypeInsn(Opcodes.NEW, ownerDescriptor)
        this.methodVisitor.visitInsn(Opcodes.DUP)

        val methodCallSignature = this.scope.getMethodCallSignature(constructorCall.getIdentifier(), constructorCall.getArguments())
        val methodDescriptor = DescriptorFactory.getMethodDescriptor(methodCallSignature)

        this.generateArguments(constructorCall)

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, ownerDescriptor, "<init>", methodDescriptor, false)
    }

    fun generate(superCall: SuperCall) {
        this.methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)

        this.generateArguments(superCall)

        val ownerDescriptor = this.scope.getSuperClassInternalName()

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, ownerDescriptor, "<init>", "()V", false)
    }

    fun generate(functionCall: FunctionCall) {
        functionCall.owner.accept(this)

        this.generateArguments(functionCall)

        val functionName = functionCall.getIdentifier()
        val methodDescriptor = DescriptorFactory.getMethodDescriptor(functionCall.functionSignature)
        val ownerDescriptor = functionCall.getOwnerType().getInternalName()

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, ownerDescriptor, functionName, methodDescriptor, false)
    }

    fun generate(addition: Addition) {
        val type = addition.getType()

        if (TypeChecker.isString(type)) {
            this.generateStringAppend(addition)

            return
        }

        this.evaluateArithmeticComponents(addition)
        this.methodVisitor.visitInsn(type.getAddOpcode())
    }

    fun generate(subtraction: Subtraction) {
        this.evaluateArithmeticComponents(subtraction)

        this.methodVisitor.visitInsn(subtraction.getType().getSubtractOpcode())
    }

    fun generate(multiplication: Multiplication) {
        this.evaluateArithmeticComponents(multiplication)

        this.methodVisitor.visitInsn(multiplication.getType().getMultiplyOpcode())
    }

    fun generate(division: Division) {
        this.evaluateArithmeticComponents(division)

        this.methodVisitor.visitInsn(division.getType().getDivideOpcode())
    }

    fun generate(emptyExpression: EmptyExpression) {
    }

    fun generate(conditionalExpression: ConditionalExpression) {
        val leftExpression = conditionalExpression.leftExpression
        val rightExpression = conditionalExpression.rightExpression

        leftExpression.accept(this)
        rightExpression.accept(this)

        val compareSign = conditionalExpression.compareSign
        val trueLabel = Label()
        val falseLabel = Label()

        this.methodVisitor.visitJumpInsn(compareSign.opcode, trueLabel)
        this.methodVisitor.visitInsn(Opcodes.ICONST_0)
        this.methodVisitor.visitJumpInsn(Opcodes.GOTO, falseLabel)
        this.methodVisitor.visitLabel(trueLabel)
        this.methodVisitor.visitInsn(Opcodes.ICONST_1)
        this.methodVisitor.visitLabel(falseLabel)
    }

    private fun evaluateArithmeticComponents(arithmeticExpression: ArithmeticExpression) {
        arithmeticExpression.leftExpression.accept(this)
        arithmeticExpression.rightExpression.accept(this)
    }

    private fun generateStringAppend(addition: Addition) {
        this.methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/StringBuilder")
        this.methodVisitor.visitInsn(Opcodes.DUP)
        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false)

        val leftExpression = addition.leftExpression

        leftExpression.accept(this)

        val leftExpressionDescriptor = leftExpression.getType().getDescriptor()
        var descriptor = "($leftExpressionDescriptor)Ljava/lang/StringBuilder;"

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", descriptor, false)

        val rightExpression = addition.rightExpression

        rightExpression.accept(this)

        val rightExpressionDescriptor = rightExpression.getType().getDescriptor()
        descriptor = "($rightExpressionDescriptor)Ljava/lang/StringBuilder;"

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", descriptor, false)
        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false)
    }

    private fun generateArguments(call: Call) {
        val functionSignature = this.scope.getMethodCallSignature(call.getIdentifier(), call.getArguments())
        val arguments = call.getArguments()
        val parameters = functionSignature.parameters

        if (arguments.size > parameters.size) {
            throw BadArgumentsToFunctionCallException(call)
        }

        arguments.forEach { it.accept(this) }

        for (i in arguments.size..(parameters.size - 1)) {
            val defaultParameter = parameters[i].defaultValue

            when (defaultParameter) {
                null -> BadArgumentsToFunctionCallException(call)
                else -> defaultParameter.accept(this)
            }
        }
    }
}