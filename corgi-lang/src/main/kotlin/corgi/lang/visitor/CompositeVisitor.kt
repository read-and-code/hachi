package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.lang.exception.NoVisitorReturnedValueException
import org.antlr.v4.runtime.ParserRuleContext

class CompositeVisitor<T>(vararg val visitors: CorgiBaseVisitor<T>) {
    fun accpet(parserRuleContext: ParserRuleContext): T {
        return this.visitors.map { parserRuleContext.accept(it) }
                .firstOrNull { it != null } ?: throw NoVisitorReturnedValueException()
    }
}