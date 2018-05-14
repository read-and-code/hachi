package corgi.lang.domain.expressions

import corgi.lang.bytecode.generators.ExpressionGenerator
import corgi.lang.domain.type.Type

abstract class Expression(val type: Type) {
    abstract fun accept(expressionGenerator: ExpressionGenerator)
}