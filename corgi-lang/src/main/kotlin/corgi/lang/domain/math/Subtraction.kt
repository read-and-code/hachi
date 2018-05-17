package corgi.lang.domain.math

import corgi.lang.bytecode.generator.ExpressionGenerator
import corgi.lang.domain.expression.Expression

class Subtraction(leftExpression: Expression, rightExpression: Expression) : ArithmeticExpression(leftExpression, rightExpression, leftExpression.type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}