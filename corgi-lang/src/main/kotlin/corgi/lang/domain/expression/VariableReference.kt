package corgi.lang.domain.expression

import corgi.lang.bytecode.generator.ExpressionGenerator
import corgi.lang.domain.type.Type

class VariableReference(val variableName: String, type: Type) : Expression(type) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}