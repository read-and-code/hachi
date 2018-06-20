package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.ConditionalExpression
import jdk.internal.org.objectweb.asm.Label
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class ConditionalExpressionGenerator(private val expressionGenerator: ExpressionGenerator, private val methodVisitor: MethodVisitor) {
    fun generate(conditionalExpression: ConditionalExpression) {
        val leftExpression = conditionalExpression.leftExpression
        val rightExpression = conditionalExpression.rightExpression

        leftExpression.accept(this.expressionGenerator)
        rightExpression.accept(this.expressionGenerator)

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
}