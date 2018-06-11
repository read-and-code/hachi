package hachi.lang.domain.node.expression

interface Call : Expression {
    fun getArguments(): List<Argument>

    fun getIdentifier(): String
}