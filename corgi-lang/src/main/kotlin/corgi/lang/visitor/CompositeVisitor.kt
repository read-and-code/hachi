package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.lang.expression.NoVisitorReturnedValueException
import org.antlr.v4.runtime.ParserRuleContext

class CompositeVisitor<T>(vararg val visitors: CorgiBaseVisitor<T>) {
    fun accpet(parserRuleContext: ParserRuleContext): T {
        return this.visitors.map { it -> parserRuleContext.accept(it) }
                .filter { it -> it != null }
                .firstOrNull() ?: throw NoVisitorReturnedValueException()
    }
}