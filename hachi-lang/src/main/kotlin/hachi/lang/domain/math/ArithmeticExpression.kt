package hachi.lang.domain.math

import hachi.lang.domain.expression.Expression
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.Type
import hachi.lang.util.TypeChecker

abstract class ArithmeticExpression(val leftExpression: Expression, val rightExpression: Expression) : Expression(getCommonType(leftExpression, rightExpression)) {
    companion object {
        private fun getCommonType(leftExpression: Expression, rightExpression: Expression): Type {
            if (TypeChecker.isString(rightExpression.type)) {
                return BuiltInType.STRING
            }

            return leftExpression.type
        }
    }
}