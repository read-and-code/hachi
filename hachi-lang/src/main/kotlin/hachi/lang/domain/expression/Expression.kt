package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.domain.type.Type

abstract class Expression(val type: Type) {
    abstract fun accept(expressionGenerator: ExpressionGenerator)
}