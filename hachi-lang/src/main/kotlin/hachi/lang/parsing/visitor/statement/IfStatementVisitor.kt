package hachi.lang.parsing.visitor.statement

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.statement.IfStatement
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class IfStatementVisitor(val statementVisitor: StatementVisitor, val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<IfStatement>() {
    override fun visitIfStatement(ifStatementContext: HachiParser.IfStatementContext): IfStatement {
        val conditionalExpressionContext = ifStatementContext.expression()
        val condition = conditionalExpressionContext.accept(this.expressionVisitor)
        val trueStatement = ifStatementContext.trueStatement.accept(this.statementVisitor)

        ifStatementContext.falseStatement?.let {
            val falseStatement = ifStatementContext.falseStatement.accept(this.statementVisitor)

            return IfStatement(condition, trueStatement, falseStatement)
        }

        return IfStatement(condition, trueStatement)
    }
}