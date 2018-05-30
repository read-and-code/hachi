package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.domain.type.Type

class EmptyExpression(type: Type) : Expression(type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}