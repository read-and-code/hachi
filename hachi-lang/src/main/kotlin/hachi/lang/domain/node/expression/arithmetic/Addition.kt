package hachi.lang.domain.node.expression.arithmetic

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.node.expression.Expression

class Addition(leftExpression: Expression, rightExpression: Expression) : ArithmeticExpression(leftExpression, rightExpression) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}