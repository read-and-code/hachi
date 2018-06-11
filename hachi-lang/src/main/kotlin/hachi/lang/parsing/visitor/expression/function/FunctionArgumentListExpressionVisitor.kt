package hachi.lang.parsing.visitor.expression.function

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class FunctionArgumentListExpressionVisitor(private val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<List<FunctionArgument>>() {
    override fun visitUnnamedFunctionArgumentList(unnamedFunctionArgumentListContext: HachiParser.UnnamedFunctionArgumentListContext): List<FunctionArgument> {
        val argumentExpressionVisitor = FunctionArgumentExpressionVisitor(this.expressionVisitor)

        return unnamedFunctionArgumentListContext.functionArgument()
                .map { it.accept(argumentExpressionVisitor) }
    }

    override fun visitNamedFunctionArgumentList(namedFunctionArgumentListContext: HachiParser.NamedFunctionArgumentListContext): List<FunctionArgument> {
        val argumentExpressionVisitor = FunctionArgumentExpressionVisitor(this.expressionVisitor)

        return namedFunctionArgumentListContext.namedFunctionArgument()
                .map { it.accept(argumentExpressionVisitor) }
    }
}