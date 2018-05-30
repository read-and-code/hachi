package hachi.lang.exception

import hachi.lang.domain.expression.Expression

class ComparisonBetweenDifferentTypesException(private val leftExpression: Expression, private val rightExpression: Expression) : CompilationException() {
    override val message: String?
        get() = "Comparison between types %s and %s not yet supported".format(this.leftExpression, this.rightExpression)
}