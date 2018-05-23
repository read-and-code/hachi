package corgi.lang.bytecode.generator

import corgi.lang.domain.expression.ConditionalExpression
import corgi.lang.domain.expression.EmptyExpression
import corgi.lang.domain.expression.FunctionCall
import corgi.lang.domain.expression.FunctionParameter
import corgi.lang.domain.expression.Value
import corgi.lang.domain.expression.VariableReference
import corgi.lang.domain.math.Addition
import corgi.lang.domain.math.ArithmeticExpression
import corgi.lang.domain.math.Division
import corgi.lang.domain.math.Multiplication
import corgi.lang.domain.math.Subtraction
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.type.BuiltInType
import corgi.lang.domain.type.ClassType
import corgi.lang.exception.CalledFunctionDoesNotExistException
import corgi.lang.exception.ComparisonBetweenDifferentTypesException
import corgi.lang.util.DescriptorFactory
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
        val parameters = functionCall.parameters
        parameters.forEach { it.accept(this) }

        val owner = functionCall.owner ?: ClassType(this.scope.getClassName())
        val methodDescriptor = this.getFunctionDescriptor(functionCall)
        val ownerDescriptor = owner.getInternalName()
        val functionName = functionCall.getFunctionName()

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, ownerDescriptor, functionName, methodDescriptor, false)
    }

    fun generate(addition: Addition) {
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
        val endLabel = Label()
        val falseLabel = Label()

        this.methodVisitor.visitJumpInsn(compareSign.opcode, falseLabel)
        this.methodVisitor.visitInsn(Opcodes.ICONST_1)
        this.methodVisitor.visitJumpInsn(Opcodes.GOTO, endLabel)
        this.methodVisitor.visitLabel(falseLabel)
        this.methodVisitor.visitInsn(Opcodes.ICONST_0)
        this.methodVisitor.visitLabel(endLabel)
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
}