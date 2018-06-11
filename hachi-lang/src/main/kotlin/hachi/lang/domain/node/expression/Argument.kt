package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.type.Type

class Argument(val expression: Expression, val parameterName: String?) : Expression {
    override fun getType(): Type {
        return this.expression.getType()
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        this.expression.accept(expressionGenerator)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        this.expression.accept(statementGenerator)
    }
}