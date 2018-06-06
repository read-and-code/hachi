package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.domain.statement.Statement
import hachi.lang.domain.type.Type

interface Expression : Statement {
    fun getType(): Type

    fun accept(expressionGenerator: ExpressionGenerator)
}