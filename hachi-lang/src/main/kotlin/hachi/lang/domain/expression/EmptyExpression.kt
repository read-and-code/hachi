package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.type.Type

class EmptyExpression(private val expressionType: Type) : Expression {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun getType(): Type {
        return this.expressionType
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}