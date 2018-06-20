package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.CompareSign
import hachi.lang.domain.node.expression.ConditionalExpression
import hachi.lang.domain.node.expression.Expression
import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.domain.node.expression.FunctionCall
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.ClassType
import jdk.internal.org.objectweb.asm.Label
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class ConditionalExpressionGenerator(private val expressionGenerator: ExpressionGenerator, private val methodVisitor: MethodVisitor) {
    fun generate(conditionalExpression: ConditionalExpression) {
        val leftExpression = conditionalExpression.leftExpression
        val rightExpression = conditionalExpression.rightExpression

        val compareSign = conditionalExpression.compareSign

        if (conditionalExpression.isPrimitiveComparison) {
            this.generatePrimitiveComparison(leftExpression, rightExpression)
        } else {
            this.generateObjectComparison(leftExpression, rightExpression, compareSign)
        }

        val trueLabel = Label()
        val falseLabel = Label()

        this.methodVisitor.visitJumpInsn(compareSign.opcode, trueLabel)
        this.methodVisitor.visitInsn(Opcodes.ICONST_0)
        this.methodVisitor.visitJumpInsn(Opcodes.GOTO, falseLabel)
        this.methodVisitor.visitLabel(trueLabel)
        this.methodVisitor.visitInsn(Opcodes.ICONST_1)
        this.methodVisitor.visitLabel(falseLabel)
    }

    private fun generateObjectComparison(leftExpression: Expression, rightExpression: Expression, compareSign: CompareSign) {
        val functionParameter = FunctionParameter("o", ClassType("java.lang.Object"), null)
        val functionParameters = listOf(functionParameter)
        val functionArgument = FunctionArgument(rightExpression, null)
        val functionArguments = listOf(functionArgument)

        when (compareSign) {
            CompareSign.EQUAL, CompareSign.NOT_EQUAL -> {
                val equalsFunctionSignature = FunctionSignature("equals", functionParameters, BuiltInType.BOOLEAN)
                val equalsFunctionCall = FunctionCall(equalsFunctionSignature, functionArguments, leftExpression)

                equalsFunctionCall.accept(this.expressionGenerator)

                this.methodVisitor.visitInsn(Opcodes.ICONST_1)
                this.methodVisitor.visitInsn(Opcodes.IXOR)
            }
            CompareSign.LESS_THAN, CompareSign.LESS_THAN_OR_EQUAL, CompareSign.GREATER_THAN, CompareSign.GREATER_THAN_OR_EQUAL -> {
                val compareToFunctionSignature = FunctionSignature("compareTo", functionParameters, BuiltInType.INT)
                val compareToFunctionCall = FunctionCall(compareToFunctionSignature, functionArguments, leftExpression)

                compareToFunctionCall.accept(this.expressionGenerator)
            }
        }
    }

    private fun generatePrimitiveComparison(leftExpression: Expression, rightExpression: Expression) {
        leftExpression.accept(this.expressionGenerator)
        rightExpression.accept(this.expressionGenerator)

        this.methodVisitor.visitInsn(Opcodes.ISUB)
    }
}