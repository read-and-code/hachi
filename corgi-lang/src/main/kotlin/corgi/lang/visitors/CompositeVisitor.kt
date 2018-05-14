package corgi.lang.visitors

import corgi.antlr.CorgiBaseVisitor
import org.antlr.v4.runtime.ParserRuleContext

class CompositeVisitor<T>(vararg val visitors: CorgiBaseVisitor<T>) {
    fun accpet(parserRuleContext: ParserRuleContext): T {
        return this.visitors.map { it -> parserRuleContext.accept(it) }
                .filter { it -> it != null }
                .first()
    }
}