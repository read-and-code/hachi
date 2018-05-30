package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.domain.type.Type

class FunctionParameter(val name: String, val defaultValue: Expression?, type: Type) : Expression(type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}