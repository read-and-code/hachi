package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.expression.EmptyExpression
import corgi.lang.domain.scope.LocalVariable
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.statement.*
import corgi.lang.domain.type.BuiltInType

class StatementVisitor(val scope: Scope) : CorgiBaseVisitor<Statement>() {
    private val expressionVisitor = ExpressionVisitor(scope)

    override fun visitPrintStatement(printStatementContext: CorgiParser.PrintStatementContext): Statement {
        val expressionContext = printStatementContext.expression()
        val expression = expressionContext.accept(this.expressionVisitor)

        return PrintStatement(expression)
    }

    override fun visitVariableDeclaration(variableDeclarationContext: CorgiParser.VariableDeclarationContext): Statement {
        val variableName = variableDeclarationContext.name().text
        val expressionContext = variableDeclarationContext.expression()
        val expression = expressionContext.accept(this.expressionVisitor)

        this.scope.addLocalVariable(LocalVariable(variableName, expression.type))

        return VariableDeclarationStatement(variableName, expression)
    }

    override fun visitFunctionCall(functionCallContext: CorgiParser.FunctionCallContext): Statement {
        return functionCallContext.accept(ExpressionVisitor(this.scope)) as Statement
    }

    override fun visitReturnVoid(returnVoidContext: CorgiParser.ReturnVoidContext): Statement {
        return ReturnStatement(EmptyExpression(BuiltInType.VOID))
    }

    override fun visitReturnWithValue(returnWithValueContext: CorgiParser.ReturnWithValueContext): Statement {
        val expression = returnWithValueContext.accept(this.expressionVisitor)

        return ReturnStatement(expression)
    }

    override fun visitBlock(blockContext: CorgiParser.BlockContext): Statement {
        val blockStatementContexts = blockContext.statement()
        val scope = Scope(this.scope)
        val statementVisitor = StatementVisitor(scope)
        val statements = blockStatementContexts.map { it.accept(statementVisitor) }

        return Block(scope, statements)
    }
}