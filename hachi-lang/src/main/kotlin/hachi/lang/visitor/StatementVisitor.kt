package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.expression.EmptyExpression
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.statement.BlockStatement
import hachi.lang.domain.statement.IfStatement
import hachi.lang.domain.statement.PrintStatement
import hachi.lang.domain.statement.ReturnStatement
import hachi.lang.domain.statement.Statement
import hachi.lang.domain.statement.VariableDeclarationStatement
import hachi.lang.domain.type.BuiltInType

class StatementVisitor(val scope: Scope) : HachiBaseVisitor<Statement>() {
    private val expressionVisitor = ExpressionVisitor(scope)

    override fun visitPrintStatement(printStatementContext: HachiParser.PrintStatementContext): Statement {
        val expressionContext = printStatementContext.expression()
        val expression = expressionContext.accept(this.expressionVisitor)

        return PrintStatement(expression)
    }

    override fun visitVariableDeclaration(variableDeclarationContext: HachiParser.VariableDeclarationContext): Statement {
        val variableName = variableDeclarationContext.name().text
        val expressionContext = variableDeclarationContext.expression()
        val expression = expressionContext.accept(this.expressionVisitor)

        this.scope.addLocalVariable(LocalVariable(variableName, expression.type))

        return VariableDeclarationStatement(variableName, expression)
    }

    override fun visitFunctionCall(functionCallContext: HachiParser.FunctionCallContext): Statement {
        return functionCallContext.accept(ExpressionVisitor(this.scope)) as Statement
    }

    override fun visitReturnVoid(returnVoidContext: HachiParser.ReturnVoidContext): Statement {
        return ReturnStatement(EmptyExpression(BuiltInType.VOID))
    }

    override fun visitReturnWithValue(returnWithValueContext: HachiParser.ReturnWithValueContext): Statement {
        val expression = returnWithValueContext.accept(this.expressionVisitor)

        return ReturnStatement(expression)
    }

    override fun visitBlockStatement(blockStatementContext: HachiParser.BlockStatementContext): Statement {
        val blockStatementContexts = blockStatementContext.statement()
        val scope = Scope(this.scope)
        val statementVisitor = StatementVisitor(scope)
        val statements = blockStatementContexts.map { it.accept(statementVisitor) }

        return BlockStatement(scope, statements)
    }

    override fun visitIfStatement(ifStatementContext: HachiParser.IfStatementContext): Statement {
        val conditionalExpressionContext = ifStatementContext.expression()
        val condition = conditionalExpressionContext.accept(this.expressionVisitor)
        val trueStatement = ifStatementContext.trueStatement.accept(this)
        val falseStatement = ifStatementContext.falseStatement.accept(this)

        return IfStatement(condition, trueStatement, falseStatement)
    }

    override fun visitForStatement(forStatementContext: HachiParser.ForStatementContext): Statement {
        val forStatementVisitor = ForStatementVisitor(this.scope)

        return forStatementContext.accept(forStatementVisitor)
    }
}