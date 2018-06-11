package hachi.lang.parsing.visitor.expression.function

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class FunctionArgumentExpressionVisitor(private val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<FunctionArgument>() {
    override fun visitFunctionArgument(functionArgumentContext: HachiParser.FunctionArgumentContext): FunctionArgument {
        val value = functionArgumentContext.expression().accept(this.expressionVisitor)

        return FunctionArgument(value, null)
    }

    override fun visitNamedFunctionArgument(namedFunctionArgumentContext: HachiParser.NamedFunctionArgumentContext): FunctionArgument {
        val value = namedFunctionArgumentContext.accept(this.expressionVisitor)
        val name = namedFunctionArgumentContext.name().text

        return FunctionArgument(value, name)
    }
}