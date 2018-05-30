package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.expression.ConditionalExpression
import hachi.lang.domain.expression.Expression
import hachi.lang.domain.expression.FunctionCall
import hachi.lang.domain.expression.Value
import hachi.lang.domain.expression.VariableReference
import hachi.lang.domain.global.CompareSign
import hachi.lang.domain.math.Addition
import hachi.lang.domain.math.Division
import hachi.lang.domain.math.Multiplication
import hachi.lang.domain.math.Subtraction
import hachi.lang.domain.scope.Scope
import hachi.lang.util.TypeResolver

class ExpressionVisitor(val scope: Scope) : HachiBaseVisitor<Expression>() {
    override fun visitVariableReference(variableReferenceContext: HachiParser.VariableReferenceContext): Expression {
        val variableName = variableReferenceContext.text
        val localVariable = this.scope.getLocalVariable(variableName)

        return VariableReference(variableName, localVariable.type)
    }

    override fun visitValue(valueContext: HachiParser.ValueContext): Expression {
        val value = valueContext.text
        val type = TypeResolver.getFromValue(valueContext.text)

        return Value(value, type)
    }

    override fun visitFunctionCall(functionCallContext: HachiParser.FunctionCallContext): Expression {
        val functionName = functionCallContext.functionName().text
        val functionSignature = this.scope.getFunctionSignature(functionName)
        val argumentContexts = functionCallContext.argument()
        val arguments = argumentContexts.sortedWith(Comparator<HachiParser.ArgumentContext> { a, b ->
            when (a.name()) {
                null -> 0
                else -> functionSignature.getIndexOfParameter(a.name().text) -
                        functionSignature.getIndexOfParameter(b.name().text)
            }
        }).map { it.expression().accept(this) }

        return FunctionCall(null, functionSignature, arguments)
    }

    override fun visitAdd(addContext: HachiParser.AddContext): Expression {
        val leftExpressionContext = addContext.expression(0)
        val rightExpressionContext = addContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this)
        val rightExpression = rightExpressionContext.accept(this)

        return Addition(leftExpression, rightExpression)
    }

    override fun visitMultiply(multiplyContext: HachiParser.MultiplyContext): Expression {
        val leftExpressionContext = multiplyContext.expression(0)
        val rightExpressionContext = multiplyContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this)
        val rightExpression = rightExpressionContext.accept(this)

        return Multiplication(leftExpression, rightExpression)
    }

    override fun visitSubtract(subtractContext: HachiParser.SubtractContext): Expression {
        val leftExpressionContext = subtractContext.expression(0)
        val rightExpressionContext = subtractContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this)
        val rightExpression = rightExpressionContext.accept(this)

        return Subtraction(leftExpression, rightExpression)
    }

    override fun visitDivide(divideContext: HachiParser.DivideContext): Expression {
        val leftExpressionContext = divideContext.expression(0)
        val rightExpressionContext = divideContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this)
        val rightExpression = rightExpressionContext.accept(this)

        return Division(leftExpression, rightExpression)
    }

    override fun visitConditionalExpression(conditionalExpressionContext: HachiParser.ConditionalExpressionContext): Expression {
        val expressionVisitor = ExpressionVisitor(this.scope)
        val leftExpressionContext = conditionalExpressionContext.expression(0)
        val rightExpressionContext = conditionalExpressionContext.expression(1)
        val leftExpression = leftExpressionContext.accept(expressionVisitor)
        val rightExpression = rightExpressionContext.accept(expressionVisitor)
        val compareSign = when (conditionalExpressionContext.cmp) {
            null -> CompareSign.NOT_EQUAL
            else -> CompareSign.fromString(conditionalExpressionContext.cmp.text)
        }

        return ConditionalExpression(leftExpression, rightExpression, compareSign)
    }
}