package hachi.lang.domain.node.expression

interface Reference : Expression {
    fun getName(): String
}