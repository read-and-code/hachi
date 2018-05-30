package hachi.lang.bytecode.generator

import hachi.lang.domain.expression.ConditionalExpression
import hachi.lang.domain.expression.EmptyExpression
import hachi.lang.domain.expression.FunctionCall
import hachi.lang.domain.expression.FunctionParameter
import hachi.lang.domain.expression.Value
import hachi.lang.domain.expression.VariableReference
import hachi.lang.domain.math.Addition
import hachi.lang.domain.math.ArithmeticExpression
import hachi.lang.domain.math.Division
import hachi.lang.domain.math.Multiplication
import hachi.lang.domain.math.Subtraction
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.ClassType
import hachi.lang.exception.BadArgumentsToFunctionCallException
import hachi.lang.exception.CalledFunctionDoesNotExistException
import hachi.lang.exception.ComparisonBetweenDifferentTypesException
import hachi.lang.util.DescriptorFactory
import jdk.internal.org.objectweb.asm.Label
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes
import jdk.internal.org.objectweb.asm.Type

class ExpressionGenerator(private val methodVisitor: MethodVisitor, val scope: Scope) {
    fun generate(variableReference: VariableReference) {
        val variableName = variableReference.variableName
        val index = this.scope.getLocalVariableIndex(variableName)
        val localVariable = this.scope.getLocalVariable(variableName)
        val type = localVariable.type

        when (type) {
            BuiltInType.INT, BuiltInType.BOOLEAN -> this.methodVisitor.visitVarInsn(Opcodes.ILOAD, index)
            else -> this.methodVisitor.visitVarInsn(Opcodes.ALOAD, index)
        }
    }

    fun generate(functionParameter: FunctionParameter) {
        val type = functionParameter.type
        val index = this.scope.getLocalVariableIndex(functionParameter.name)

        when (type) {
            BuiltInType.INT -> this.methodVisitor.visitVarInsn(Opcodes.ILOAD, index)
            else -> this.methodVisitor.visitVarInsn(Opcodes.ALOAD, index)
        }
    }

    fun generate(value: Value) {
        val type = value.type
        val stringValue = value.value

        when (type) {
            BuiltInType.INT, BuiltInType.BOOLEAN -> this.methodVisitor.visitIntInsn(Opcodes.BIPUSH, stringValue.toInt())
            BuiltInType.STRING -> this.methodVisitor.visitLdcInsn(stringValue.removePrefix("\"").removeSuffix("\""))
        }
    }

    fun generate(functionCall: FunctionCall) {
        val functionName = functionCall.getFunctionName()
        val functionSignature = this.scope.getFunctionSignature(functionName)
        val arguments = functionCall.arguments
        val parameters = functionSignature.parameters

        if (arguments.size > parameters.size) {
            throw BadArgumentsToFunctionCallException()
        }

        arguments.forEach { it.accept(this) }

        for (i in arguments.size..(parameters.size - 1)) {
            val defaultParameter = parameters[i].defaultValue

            when (defaultParameter) {
                null -> BadArgumentsToFunctionCallException()
                else -> defaultParameter.accept(this)
            }
        }

        val owner = functionCall.owner ?: ClassType(this.scope.getClassName())
        val methodDescriptor = this.getFunctionDescriptor(functionCall)
        val ownerDescriptor = owner.getInternalName()

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, ownerDescriptor, functionName, methodDescriptor, false)
    }

    fun generate(addition: Addition) {
        if (addition.type.equals(BuiltInType.STRING)) {
            this.generateStringAppend(addition)

            return
        }

        this.evaluateArithmeticComponents(addition)

        this.methodVisitor.visitInsn(Opcodes.IADD)
    }

    fun generate(subtraction: Subtraction) {
        this.evaluateArithmeticComponents(subtraction)

        this.methodVisitor.visitInsn(Opcodes.ISUB)
    }

    fun generate(multiplication: Multiplication) {
        this.evaluateArithmeticComponents(multiplication)

        this.methodVisitor.visitInsn(Opcodes.IMUL)
    }

    fun generate(division: Division) {
        this.evaluateArithmeticComponents(division)

        this.methodVisitor.visitInsn(Opcodes.IDIV)
    }

    fun generate(emptyExpression: EmptyExpression) {
    }

    fun generate(conditionalExpression: ConditionalExpression) {
        val leftExpression = conditionalExpression.leftExpression
        val rightExpression = conditionalExpression.rightExpression

        if (leftExpression.type != rightExpression.type) {
            throw ComparisonBetweenDifferentTypesException(leftExpression, rightExpression)
        }

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

    private fun getFunctionDescriptor(functionCall: FunctionCall): String {
        return this.getDescriptorForFunctionInScope(functionCall)
                ?: (this.getDescriptorForFunctionOnClasspath(functionCall)
                        ?: throw CalledFunctionDoesNotExistException(functionCall))
    }

    private fun getDescriptorForFunctionInScope(functionCall: FunctionCall): String? {
        return DescriptorFactory.getMethodDescriptor(functionCall.functionSignature)
    }

    private fun getDescriptorForFunctionOnClasspath(functionCall: FunctionCall): String? {
        return try {
            val functionName = functionCall.getFunctionName()
            val owner = functionCall.owner
            val className = owner?.getName() ?: this.scope.getClassName()
            val clazz = Class.forName(className)
            val method = clazz.getMethod(functionName)

            Type.getMethodDescriptor(method)
        } catch (e: ReflectiveOperationException) {
            e.printStackTrace()

            ""
        }
    }

    private fun generateStringAppend(addition: Addition) {
        this.methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/StringBuilder")
        this.methodVisitor.visitInsn(Opcodes.DUP)
        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false)

        val leftExpression = addition.leftExpression

        leftExpression.accept(this)

        val leftExpressionDescriptor = leftExpression.type.getDescriptor()
        var descriptor = "($leftExpressionDescriptor)Ljava/lang/StringBuilder;"

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", descriptor, false)

        val rightExpression = addition.rightExpression

        rightExpression.accept(this)

        val rightExpressionDescriptor = rightExpression.type.getDescriptor()
        descriptor = "($rightExpressionDescriptor)Ljava/lang/StringBuilder;"

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", descriptor, false)
        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false)
    }
}