package corgi.lang.domain.expression

import corgi.lang.bytecode.generator.ExpressionGenerator
import corgi.lang.domain.type.Type

abstract class Expression(val type: Type) {
    abstract fun accept(expressionGenerator: ExpressionGenerator)
}