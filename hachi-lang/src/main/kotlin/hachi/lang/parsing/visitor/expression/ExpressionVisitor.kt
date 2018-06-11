package hachi.lang.parsing.visitor.expression

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.Expression
import hachi.lang.domain.scope.Scope
import hachi.lang.parsing.visitor.expression.function.CallExpressionVisitor

class ExpressionVisitor(val scope: Scope) : HachiBaseVisitor<Expression>() {
    private val arithmeticExpressionVisitor = ArithmeticExpressionVisitor(this)

    private val variableReferenceExpressionVisitor = VariableReferenceExpressionVisitor(this.scope)

    private val valueExpressionVisitor = ValueExpressionVisitor()

    private val callExpressionVisitor = CallExpressionVisitor(this, this.scope)

    private val conditionalExpressionVisitor = ConditionalExpressionVisitor(this)

    override fun visitVariableReference(variableReferenceContext: HachiParser.VariableReferenceContext): Expression {
        return this.variableReferenceExpressionVisitor.visitVariableReference(variableReferenceContext)
    }

    override fun visitValue(valueContext: HachiParser.ValueContext): Expression {
        return this.valueExpressionVisitor.visitValue(valueContext)
    }

    override fun visitFunctionCall(functionCallContext: HachiParser.FunctionCallContext): Expression {
        return this.callExpressionVisitor.visitFunctionCall(functionCallContext)
    }

    override fun visitConstructorCall(constructorCallContext: HachiParser.ConstructorCallContext): Expression {
        return this.callExpressionVisitor.visitConstructorCall(constructorCallContext)
    }

    override fun visitSupercall(supercallContext: HachiParser.SupercallContext): Expression {
        return this.callExpressionVisitor.visitSupercall(supercallContext)
    }

    override fun visitAdd(addContext: HachiParser.AddContext): Expression {
        return this.arithmeticExpressionVisitor.visitAdd(addContext)
    }

    override fun visitMultiply(multiplyContext: HachiParser.MultiplyContext): Expression {
        return this.arithmeticExpressionVisitor.visitMultiply(multiplyContext)
    }

    override fun visitSubtract(subtractContext: HachiParser.SubtractContext): Expression {
        return this.arithmeticExpressionVisitor.visitSubtract(subtractContext)
    }

    override fun visitDivide(divideContext: HachiParser.DivideContext): Expression {
        return this.arithmeticExpressionVisitor.visitDivide(divideContext)
    }

    override fun visitConditionalExpression(conditionalExpressionContext: HachiParser.ConditionalExpressionContext): Expression {
        return this.conditionalExpressionVisitor.visitConditionalExpression(conditionalExpressionContext)
    }
}