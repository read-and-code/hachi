package hachi.lang.parsing.visitor.statement

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.statement.Statement
import hachi.lang.domain.scope.Scope
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class StatementVisitor(private val scope: Scope) : HachiBaseVisitor<Statement>() {
    private val expressionVisitor = ExpressionVisitor(scope)

    private val printStatementVisitor = PrintStatementVisitor(this.expressionVisitor)

    private val variableDeclarationStatementVisitor = VariableDeclarationStatementVisitor(this.expressionVisitor, this.scope)

    private val assignmentStatementVisitor = AssignmentStatementVisitor(this.expressionVisitor)

    private val returnStatementVisitor = ReturnStatementVisitor(this.expressionVisitor)

    private val blockStatementVisitor = BlockStatementVisitor(this.scope)

    private val ifStatementVisitor = IfStatementVisitor(this, this.expressionVisitor)

    private val forStatementVisitor = ForStatementVisitor(this.scope)

    override fun visitPrintStatement(printStatementContext: HachiParser.PrintStatementContext): Statement {
        return this.printStatementVisitor.visitPrintStatement(printStatementContext)
    }

    override fun visitVariableDeclaration(variableDeclarationContext: HachiParser.VariableDeclarationContext): Statement {
        return this.variableDeclarationStatementVisitor.visitVariableDeclaration(variableDeclarationContext)
    }

    override fun visitAssignmentStatement(assignmentStatementContext: HachiParser.AssignmentStatementContext): Statement {
        return this.assignmentStatementVisitor.visitAssignmentStatement(assignmentStatementContext)
    }

    override fun visitReturnVoid(returnVoidContext: HachiParser.ReturnVoidContext): Statement {
        return this.returnStatementVisitor.visitReturnVoid(returnVoidContext)
    }

    override fun visitReturnWithValue(returnWithValueContext: HachiParser.ReturnWithValueContext): Statement {
        return this.returnStatementVisitor.visitReturnWithValue(returnWithValueContext)
    }

    override fun visitBlockStatement(blockStatementContext: HachiParser.BlockStatementContext): Statement {
        return this.blockStatementVisitor.visitBlockStatement(blockStatementContext)
    }

    override fun visitIfStatement(ifStatementContext: HachiParser.IfStatementContext): Statement {
        return this.ifStatementVisitor.visitIfStatement(ifStatementContext)
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

    override fun visitSupercall(supercallContext: HachiParser.SupercallContext): Statement {
        return this.expressionVisitor.visitSupercall(supercallContext)
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

    override fun visitForStatement(forStatementContext: HachiParser.ForStatementContext): Statement {
        return this.forStatementVisitor.visitForStatement(forStatementContext)
    }
}