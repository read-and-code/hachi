package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.statement.AssignmentStatement
import hachi.lang.domain.statement.RangedForStatement
import hachi.lang.domain.statement.VariableDeclarationStatement

class ForStatementVisitor(scope: Scope) : HachiBaseVisitor<RangedForStatement>() {
    val scope = Scope(scope)

    private val expressionVisitor = ExpressionVisitor(this.scope)

    private val statementVisitor = StatementVisitor(this.scope)

    override fun visitForStatement(forStatementContext: HachiParser.ForStatementContext): RangedForStatement {
        val forConditionContext = forStatementContext.forCondition()
        val startExpression = forConditionContext.startExpression.accept(this.expressionVisitor)
        val endExpression = forConditionContext.endExpression.accept(this.expressionVisitor)
        val iterator = forConditionContext.iterator
        val variableName = iterator.text

        return if (this.scope.localVariableExists(variableName)) {
            val iteratorVariable = AssignmentStatement(variableName, startExpression)
            val statement = forStatementContext.statement().accept(this.statementVisitor)

            RangedForStatement(iteratorVariable, startExpression, endExpression, statement, variableName, this.scope)
        } else {
            this.scope.addLocalVariable(LocalVariable(variableName, startExpression.getType()))

            val iteratorVariable = VariableDeclarationStatement(variableName, startExpression)
            val statement = forStatementContext.statement().accept(this.statementVisitor)

            RangedForStatement(iteratorVariable, startExpression, endExpression, statement, variableName, this.scope)
        }
    }
}