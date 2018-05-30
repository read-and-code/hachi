package hachi.lang.domain.math

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.domain.expression.Expression

class Multiplication(leftExpression: Expression, rightExpression: Expression) : ArithmeticExpression(leftExpression, rightExpression, leftExpression.type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}