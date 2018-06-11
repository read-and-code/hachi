package hachi.lang.parsing.visitor.expression.function

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.Argument
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class ArgumentExpressionVisitor(private val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<Argument>() {
    override fun visitArgument(argumentContext: HachiParser.ArgumentContext): Argument {
        val value = argumentContext.expression().accept(this.expressionVisitor)

        return Argument(value, null)
    }

    override fun visitNamedArgument(namedArgumentContext: HachiParser.NamedArgumentContext): Argument {
        val value = namedArgumentContext.accept(this.expressionVisitor)
        val name = namedArgumentContext.name().text

        return Argument(value, name)
    }
}