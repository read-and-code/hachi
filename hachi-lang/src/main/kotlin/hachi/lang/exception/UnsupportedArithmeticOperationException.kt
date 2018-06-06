package hachi.lang.exception

import hachi.lang.domain.expression.math.ArithmeticExpression

class UnsupportedArithmeticOperationException(private val arithmeticExpression: ArithmeticExpression) : CompilationException() {
    override val message: String?
        get() = "Unsupported arithmetic operation between %s and %s".format(this.arithmeticExpression.leftExpression, this.arithmeticExpression.rightExpression)
}