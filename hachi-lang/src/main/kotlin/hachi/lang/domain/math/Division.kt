package hachi.lang.domain.math

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.domain.expression.Expression

class Division(leftExpression: Expression, rightExpression: Expression) : ArithmeticExpression(leftExpression, rightExpression) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}