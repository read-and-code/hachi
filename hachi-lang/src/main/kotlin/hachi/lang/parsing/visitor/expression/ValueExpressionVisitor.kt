package hachi.lang.parsing.visitor.expression

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.Value
import hachi.lang.util.TypeResolver

class ValueExpressionVisitor : HachiBaseVisitor<Value>() {
    override fun visitValue(valueContext: HachiParser.ValueContext): Value {
        val value = valueContext.text
        val type = TypeResolver.getFromValue(valueContext.text)

        return Value(value, type)
    }
}