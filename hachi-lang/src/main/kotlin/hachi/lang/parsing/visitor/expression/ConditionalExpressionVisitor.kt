package hachi.lang.parsing.visitor.expression

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.CompareSign
import hachi.lang.domain.node.expression.ConditionalExpression
import hachi.lang.domain.node.expression.Value
import hachi.lang.domain.type.BuiltInType

class ConditionalExpressionVisitor(val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<ConditionalExpression>() {
    override fun visitConditionalExpression(conditionalExpressionContext: HachiParser.ConditionalExpressionContext): ConditionalExpression {
        val leftExpressionContext = conditionalExpressionContext.expression(0)
        val rightExpressionContext = conditionalExpressionContext.expression(1)
        val leftExpression = leftExpressionContext.accept(this.expressionVisitor)
        val rightExpression = when (rightExpressionContext) {
            null -> Value("0", BuiltInType.INT)
            else -> rightExpressionContext.accept(this.expressionVisitor)
        }
        val compareSign = when (conditionalExpressionContext.cmp) {
            null -> CompareSign.NOT_EQUAL
            else -> CompareSign.fromString(conditionalExpressionContext.cmp.text)
        }

        return ConditionalExpression(leftExpression, rightExpression, compareSign)
    }
}