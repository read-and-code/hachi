package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.arithmetic.Addition
import hachi.lang.domain.node.expression.arithmetic.ArithmeticExpression
import hachi.lang.domain.node.expression.arithmetic.Division
import hachi.lang.domain.node.expression.arithmetic.Multiplication
import hachi.lang.domain.node.expression.arithmetic.Subtraction
import hachi.lang.util.TypeChecker
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class ArithmeticExpressionGenerator(val expressionGenerator: ExpressionGenerator, val methodVisitor: MethodVisitor) {
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

    private fun evaluateArithmeticComponents(arithmeticExpression: ArithmeticExpression) {
        arithmeticExpression.leftExpression.accept(this.expressionGenerator)
        arithmeticExpression.rightExpression.accept(this.expressionGenerator)
    }

    private fun generateStringAppend(addition: Addition) {
        this.methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/StringBuilder")
        this.methodVisitor.visitInsn(Opcodes.DUP)
        this.methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false)

        val leftExpression = addition.leftExpression

        leftExpression.accept(this.expressionGenerator)

        val leftExpressionDescriptor = leftExpression.getType().getDescriptor()
        var descriptor = "($leftExpressionDescriptor)Ljava/lang/StringBuilder;"

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", descriptor, false)

        val rightExpression = addition.rightExpression

        rightExpression.accept(this.expressionGenerator)

        val rightExpressionDescriptor = rightExpression.getType().getDescriptor()
        descriptor = "($rightExpressionDescriptor)Ljava/lang/StringBuilder;"

        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", descriptor, false)
        this.methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false)
    }
}