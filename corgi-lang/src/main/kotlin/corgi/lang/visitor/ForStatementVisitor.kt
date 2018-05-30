package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.scope.LocalVariable
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.statement.AssignmentStatement
import corgi.lang.domain.statement.RangedForStatement
import corgi.lang.domain.statement.VariableDeclarationStatement

class ForStatementVisitor(scope: Scope) : CorgiBaseVisitor<RangedForStatement>() {
    val scope = Scope(scope)

    private val expressionVisitor = ExpressionVisitor(this.scope)

    private val statementVisitor = StatementVisitor(this.scope)

    override fun visitForStatement(forStatementContext: CorgiParser.ForStatementContext): RangedForStatement {
        val forConditionContext = forStatementContext.forCondition()
        val startExpression = forConditionContext.startExpression.accept(this.expressionVisitor)
        val endExpression = forConditionContext.endExpression.accept(this.expressionVisitor)
        val iterator = forConditionContext.iterator
        val variableName = iterator.text

        if (this.scope.localVariableExists(variableName)) {
            val iteratorVariable = AssignmentStatement(variableName, startExpression)
            val statement = forStatementContext.statement().accept(this.statementVisitor)

            return RangedForStatement(iteratorVariable, startExpression, endExpression, statement, variableName, this.scope)
        } else {
            this.scope.addLocalVariable(LocalVariable(variableName, startExpression.type))

            val iteratorVariable = VariableDeclarationStatement(variableName, startExpression)
            val statement = forStatementContext.statement().accept(this.statementVisitor)

            return RangedForStatement(iteratorVariable, startExpression, endExpression, statement, variableName, this.scope)
        }
    }
}