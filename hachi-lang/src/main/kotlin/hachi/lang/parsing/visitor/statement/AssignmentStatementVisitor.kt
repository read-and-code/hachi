package hachi.lang.parsing.visitor.statement

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.statement.AssignmentStatement
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class AssignmentStatementVisitor(private val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<AssignmentStatement>() {
    override fun visitAssignmentStatement(assignmentStatementContext: HachiParser.AssignmentStatementContext): AssignmentStatement {
        val expressionContext = assignmentStatementContext.expression()
        val expression = expressionContext.accept(this.expressionVisitor)
        val variableName = assignmentStatementContext.name().text

        return AssignmentStatement(variableName, expression)
    }
}