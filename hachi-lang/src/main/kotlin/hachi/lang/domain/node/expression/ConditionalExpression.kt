package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.CompareSign
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.Type

class ConditionalExpression(val leftExpression: Expression, val rightExpression: Expression, val compareSign: CompareSign) : Expression {
    val type = BuiltInType.BOOLEAN

    override fun getType(): Type {
        return this.type
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}