package corgi.lang.domain.math

import corgi.lang.bytecode.generator.ExpressionGenerator
import corgi.lang.domain.expression.Expression

class Division(leftExpression: Expression, rightExpression: Expression) : ArithmeticExpression(leftExpression, rightExpression, leftExpression.type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}