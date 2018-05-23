package corgi.lang.domain.expression

import corgi.lang.CompareSign
import corgi.lang.bytecode.generator.ExpressionGenerator
import corgi.lang.domain.type.BuiltInType

class ConditionalExpression(val leftExpression: Expression, val rightExpression: Expression, val compareSign: CompareSign) : Expression(BuiltInType.BOOLEAN) {
    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }
}