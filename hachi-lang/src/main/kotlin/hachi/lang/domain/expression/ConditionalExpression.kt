package hachi.lang.domain.expression

import hachi.lang.bytecode.generator.ExpressionGenerator
import hachi.lang.domain.global.CompareSign
import hachi.lang.domain.type.BuiltInType

class ConditionalExpression(val leftExpression: Expression, val rightExpression: Expression, val compareSign: CompareSign) : Expression(BuiltInType.BOOLEAN) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}