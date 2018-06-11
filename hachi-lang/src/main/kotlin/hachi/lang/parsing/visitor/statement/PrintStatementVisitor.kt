package hachi.lang.parsing.visitor.statement

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.statement.PrintStatement
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class PrintStatementVisitor(val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<PrintStatement>() {
    override fun visitPrintStatement(printStatementContext: HachiParser.PrintStatementContext): PrintStatement {
        val expressionContext = printStatementContext.expression()
        val expression = expressionContext.accept(this.expressionVisitor)

        return PrintStatement(expression)
    }
}