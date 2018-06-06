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

        this.scope.addLocalVariable(LocalVariable(variableName, expression.getType()))

        return VariableDeclarationStatement(variableName, expression)
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

        ifStatementContext.falseStatement?.let {
            val falseStatement = ifStatementContext.falseStatement.accept(this)

            return IfStatement(condition, trueStatement, falseStatement)
        }

        return IfStatement(condition, trueStatement)
    }

    override fun visitVariableReference(variableReferenceContext: HachiParser.VariableReferenceContext): Statement {
        return this.expressionVisitor.visitVariableReference(variableReferenceContext)
    }

    override fun visitValue(valueContext: HachiParser.ValueContext): Statement {
        return this.expressionVisitor.visitValue(valueContext)
    }

    override fun visitFunctionCall(functionCallContext: HachiParser.FunctionCallContext): Statement {
        return this.expressionVisitor.visitFunctionCall(functionCallContext)
    }

    override fun visitConstructorCall(constructorCallContext: HachiParser.ConstructorCallContext): Statement {
        return this.expressionVisitor.visitConstructorCall(constructorCallContext)
    }

    override fun visitAdd(addContext: HachiParser.AddContext): Statement {
        return this.expressionVisitor.visitAdd(addContext)
    }

    override fun visitSubtract(subtractContext: HachiParser.SubtractContext): Statement {
        return this.expressionVisitor.visitSubtract(subtractContext)
    }

    override fun visitMultiply(multiplyContext: HachiParser.MultiplyContext): Statement {
        return this.expressionVisitor.visitMultiply(multiplyContext)
    }

    override fun visitDivide(divideContext: HachiParser.DivideContext): Statement {
        return this.expressionVisitor.visitDivide(divideContext)
    }

    override fun visitConditionalExpression(conditionalExpressionContext: HachiParser.ConditionalExpressionContext): Statement {
        return this.expressionVisitor.visitConditionalExpression(conditionalExpressionContext)
    }
}