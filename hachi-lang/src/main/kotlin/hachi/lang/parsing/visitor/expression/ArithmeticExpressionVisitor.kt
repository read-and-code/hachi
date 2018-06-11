package hachi.lang.parsing.visitor.expression

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.arithmetic.Addition
import hachi.lang.domain.node.expression.arithmetic.ArithmeticExpression
import hachi.lang.domain.node.expression.arithmetic.Division
import hachi.lang.domain.node.expression.arithmetic.Multiplication
import hachi.lang.domain.node.expression.arithmetic.Subtraction

class ArithmeticExpressionVisitor(val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<ArithmeticExpression>() {
    override fun visitAdd(addContext: HachiParser.AddContext): ArithmeticExpression {
        val leftExpressionContext = addContext.expression(0)
        val rightExpressionContext = addContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this.expressionVisitor)
        val rightExpression = rightExpressionContext.accept(this.expressionVisitor)

        return Addition(leftExpression, rightExpression)
    }

    override fun visitMultiply(multiplyContext: HachiParser.MultiplyContext): ArithmeticExpression {
        val leftExpressionContext = multiplyContext.expression(0)
        val rightExpressionContext = multiplyContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this.expressionVisitor)
        val rightExpression = rightExpressionContext.accept(this.expressionVisitor)

        return Multiplication(leftExpression, rightExpression)
    }

    override fun visitSubtract(subtractContext: HachiParser.SubtractContext): ArithmeticExpression {
        val leftExpressionContext = subtractContext.expression(0)
        val rightExpressionContext = subtractContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this.expressionVisitor)
        val rightExpression = rightExpressionContext.accept(this.expressionVisitor)

        return Subtraction(leftExpression, rightExpression)
    }

    override fun visitDivide(divideContext: HachiParser.DivideContext): ArithmeticExpression {
        val leftExpressionContext = divideContext.expression(0)
        val rightExpressionContext = divideContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this.expressionVisitor)
        val rightExpression = rightExpressionContext.accept(this.expressionVisitor)

        return Division(leftExpression, rightExpression)
    }
}