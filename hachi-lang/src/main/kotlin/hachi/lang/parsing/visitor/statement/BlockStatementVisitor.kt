package hachi.lang.parsing.visitor.statement

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.statement.BlockStatement
import hachi.lang.domain.scope.Scope

class BlockStatementVisitor(val scope: Scope) : HachiBaseVisitor<BlockStatement>() {
    override fun visitBlockStatement(blockStatementContext: HachiParser.BlockStatementContext): BlockStatement {
        val blockStatementContexts = blockStatementContext.statement()
        val scope = Scope(this.scope)
        val statementVisitor = StatementVisitor(scope)
        val statements = blockStatementContexts.map { it.accept(statementVisitor) }

        return BlockStatement(scope, statements)
    }
}