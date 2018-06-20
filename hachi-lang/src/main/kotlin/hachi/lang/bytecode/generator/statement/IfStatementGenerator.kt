package hachi.lang.bytecode.generator.statement

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.domain.node.statement.IfStatement
import jdk.internal.org.objectweb.asm.Label
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class IfStatementGenerator(private val statementGenerator: StatementGenerator, private val expressionGenerator: ExpressionGenerator, private val methodVisitor: MethodVisitor) {
    fun generate(ifStatement: IfStatement) {
        ifStatement.condition.accept(this.expressionGenerator)

        val trueLabel = Label()
        val falseLabel = Label()

        this.methodVisitor.visitJumpInsn(Opcodes.IFNE, trueLabel)

        ifStatement.falseStatement.let {
            it?.accept(this.statementGenerator)
        }

        this.methodVisitor.visitJumpInsn(Opcodes.GOTO, falseLabel)
        this.methodVisitor.visitLabel(trueLabel)

        ifStatement.trueStatement.accept(this.statementGenerator)

        this.methodVisitor.visitLabel(falseLabel)
    }
}