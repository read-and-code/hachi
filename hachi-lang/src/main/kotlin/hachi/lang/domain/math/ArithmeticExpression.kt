package hachi.lang.domain.math

import hachi.lang.domain.expression.Expression
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.Type
import hachi.lang.exception.UnsupportedArithmeticOperationException

abstract class ArithmeticExpression(val leftExpression: Expression, val rightExpression: Expression, type: Type) : Expression(type) {
    init {
        if (this.type != BuiltInType.INT && type != BuiltInType.STRING) {
            throw UnsupportedArithmeticOperationException(this)
        }
    }
}