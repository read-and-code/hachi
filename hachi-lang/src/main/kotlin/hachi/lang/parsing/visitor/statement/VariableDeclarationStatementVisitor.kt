package hachi.lang.parsing.visitor.statement

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.statement.VariableDeclarationStatement
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class VariableDeclarationStatementVisitor(val expressionVisitor: ExpressionVisitor, val scope: Scope) : HachiBaseVisitor<VariableDeclarationStatement>() {
    override fun visitVariableDeclaration(variableDeclarationContext: HachiParser.VariableDeclarationContext): VariableDeclarationStatement {
        val variableName = variableDeclarationContext.name().text
        val expressionContext = variableDeclarationContext.expression()
        val expression = expressionContext.accept(this.expressionVisitor)

        this.scope.addLocalVariable(LocalVariable(variableName, expression.getType()))

        return VariableDeclarationStatement(variableName, expression)
    }
}