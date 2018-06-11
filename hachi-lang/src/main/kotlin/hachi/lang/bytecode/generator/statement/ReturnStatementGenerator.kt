package hachi.lang.bytecode.generator.statement

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.domain.node.statement.ReturnStatement
import jdk.internal.org.objectweb.asm.MethodVisitor

class ReturnStatementGenerator(val expressionGenerator: ExpressionGenerator, val methodVisitor: MethodVisitor) {
    fun generate(returnStatement: ReturnStatement) {
        val expression = returnStatement.expression

        expression.accept(this.expressionGenerator)

        this.methodVisitor.visitInsn(expression.getType().getReturnOpcode())
    }
}