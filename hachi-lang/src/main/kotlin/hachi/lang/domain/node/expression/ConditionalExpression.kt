package hachi.lang.domain.node.expression

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.CompareSign
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.Type
import hachi.lang.exception.MixedComparisonNotAllowedException

class ConditionalExpression(val leftExpression: Expression, val rightExpression: Expression, val compareSign: CompareSign) : Expression {
    val type = BuiltInType.BOOLEAN

    var isPrimitiveComparison = false

    init {
        val isLeftExpressionPrimitive = this.leftExpression.getType().getTypeClass()!!.isPrimitive
        val isRightExpressionPrimitive = this.rightExpression.getType().getTypeClass()!!.isPrimitive

        this.isPrimitiveComparison = isLeftExpressionPrimitive && isRightExpressionPrimitive

        val isObjectComparison = !isRightExpressionPrimitive && !isRightExpressionPrimitive
        val isMixedComparison = !this.isPrimitiveComparison && !isObjectComparison

        if (isMixedComparison) {
            throw MixedComparisonNotAllowedException(this.leftExpression.getType(), this.rightExpression.getType())
        }
    }

    override fun getType(): Type {
        return this.type
    }

    override fun accept(expressionGenerator: ExpressionGenerator) {
        expressionGenerator.generate(this)
    }

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}