package hachi.lang.domain.math

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.expression.Expression

class Subtraction(leftExpression: Expression, rightExpression: Expression) : ArithmeticExpression(leftExpression, rightExpression) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}