package hachi.lang.parsing.visitor.expression.function

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.Argument
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class ArgumentExpressionsListVisitor(private val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<List<Argument>>() {
    override fun visitUnnamedArgumentList(unnamedArgumentListContext: HachiParser.UnnamedArgumentListContext): List<Argument> {
        val argumentExpressionVisitor = ArgumentExpressionVisitor(this.expressionVisitor)

        return unnamedArgumentListContext.argument()
                .map { it.accept(argumentExpressionVisitor) }
    }

    override fun visitNamedArgumentList(namedArgumentListContext: HachiParser.NamedArgumentListContext): List<Argument> {
        val argumentExpressionVisitor = ArgumentExpressionVisitor(this.expressionVisitor)

        return namedArgumentListContext.namedArgument()
                .map { it.accept(argumentExpressionVisitor) }
    }
}