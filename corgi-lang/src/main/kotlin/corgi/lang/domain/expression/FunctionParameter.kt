package corgi.lang.domain.expression

import corgi.lang.bytecode.generator.ExpressionGenerator
import corgi.lang.domain.type.Type

class FunctionParameter(val name: String, val defaultValue: Expression?, type: Type) : Expression(type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}