package hachi.lang.domain.expression.math

import hachi.lang.domain.expression.Expression
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.Type
import hachi.lang.util.TypeChecker

abstract class ArithmeticExpression(val leftExpression: Expression, val rightExpression: Expression) : Expression {
    private val arithmeticExpressionType = getCommonType(leftExpression, rightExpression)

    companion object {
        private fun getCommonType(leftExpression: Expression, rightExpression: Expression): Type {
            if (TypeChecker.isString(rightExpression.getType())) {
                return BuiltInType.STRING
            }

            return leftExpression.getType()
        }
    }

    override fun getType(): Type {
        return this.arithmeticExpressionType
    }
}