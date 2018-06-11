package hachi.lang.domain.node.expression

interface Call : Expression {
    fun getArguments(): List<FunctionArgument>

    fun getIdentifier(): String
}