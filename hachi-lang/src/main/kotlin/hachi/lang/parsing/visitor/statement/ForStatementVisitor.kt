package hachi.lang.parsing.visitor.statement

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.statement.AssignmentStatement
import hachi.lang.domain.node.statement.RangedForStatement
import hachi.lang.domain.node.statement.VariableDeclarationStatement
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class ForStatementVisitor(val scope: Scope) : HachiBaseVisitor<RangedForStatement>() {
    private val expressionVisitor = ExpressionVisitor(this.scope)

    override fun visitForStatement(forStatementContext: HachiParser.ForStatementContext): RangedForStatement {
        val newScope = Scope(this.scope)
        val forConditionContext = forStatementContext.forCondition()
        val startExpression = forConditionContext.startExpression.accept(this.expressionVisitor)
        val endExpression = forConditionContext.endExpression.accept(this.expressionVisitor)
        val statementVisitor = StatementVisitor(newScope)
        val iterator = forConditionContext.iterator
        val variableName = iterator.text

        return if (newScope.localVariableExists(variableName)) {
            val iteratorVariable = AssignmentStatement(variableName, startExpression)
            val statement = forStatementContext.statement().accept(statementVisitor)

            RangedForStatement(iteratorVariable, startExpression, endExpression, statement, variableName, newScope)
        } else {
            newScope.addLocalVariable(LocalVariable(variableName, startExpression.getType()))

            val iteratorVariable = VariableDeclarationStatement(variableName, startExpression)
            val statement = forStatementContext.statement().accept(statementVisitor)

            RangedForStatement(iteratorVariable, startExpression, endExpression, statement, variableName, newScope)
        }
    }
}