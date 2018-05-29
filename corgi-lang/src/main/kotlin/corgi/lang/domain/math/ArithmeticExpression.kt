package corgi.lang.domain.math

import corgi.lang.domain.expression.Expression
import corgi.lang.domain.type.BuiltInType
import corgi.lang.domain.type.Type
import corgi.lang.exception.UnsupportedArithmeticOperationException

abstract class ArithmeticExpression(val leftExpression: Expression, val rightExpression: Expression, type: Type) : Expression(type) {
    init {
        if (this.type != BuiltInType.INT && type != BuiltInType.STRING) {
            throw UnsupportedArithmeticOperationException(this)
        }
    }
}