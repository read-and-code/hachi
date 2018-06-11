package hachi.lang.bytecode.generator.statement

import hachi.lang.domain.node.statement.BlockStatement
import jdk.internal.org.objectweb.asm.MethodVisitor

class BlockStatementGenerator(val methodVisitor: MethodVisitor) {
    fun generate(blockStatement: BlockStatement) {
        val scope = blockStatement.scope
        val statements = blockStatement.statements
        val statementGenerator = StatementGenerator(this.methodVisitor, scope)

        statements.forEach { it.accept(statementGenerator) }
    }
}