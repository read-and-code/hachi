package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.scope.LocalVariable
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.statement.PrintStatement
import corgi.lang.domain.statement.Statement
import corgi.lang.domain.statement.VariableDeclarationStatement

class StatementVisitor(val scope: Scope) : CorgiBaseVisitor<Statement>() {
    override fun visitPrintStatement(printStatementContext: CorgiParser.PrintStatementContext): Statement {
        val expressionContext = printStatementContext.expression()
        val expressionVisitor = ExpressionVisitor(this.scope)
        val expression = expressionContext.accept(expressionVisitor)

        return PrintStatement(expression)
    }

    override fun visitVariableDeclaration(variableDeclarationContext: CorgiParser.VariableDeclarationContext): Statement {
        val variableName = variableDeclarationContext.name().text
        val expressionContext = variableDeclarationContext.expression()
        val expressionVisitor = ExpressionVisitor(this.scope)
        val expression = expressionContext.accept(expressionVisitor)

        this.scope.addLocalVariable(LocalVariable(variableName, expression.type))

        return VariableDeclarationStatement(variableName, expression)
    }

    override fun visitFunctionCall(functionCallContext: CorgiParser.FunctionCallContext): Statement {
        return functionCallContext.accept(ExpressionVisitor(this.scope)) as Statement
    }
}