package hachi.lang.domain.expression

interface Call : Expression {
    fun getArguments(): List<Expression>

    fun getIdentifier(): String
}