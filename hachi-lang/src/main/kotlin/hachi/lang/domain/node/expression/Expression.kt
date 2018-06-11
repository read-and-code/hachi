package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.domain.node.statement.Statement
import hachi.lang.domain.type.Type

interface Expression : Statement {
    fun getType(): Type

    fun accept(expressionGenerator: ExpressionGenerator)
}