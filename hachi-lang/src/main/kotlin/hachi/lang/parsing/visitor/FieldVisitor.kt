package hachi.lang.parsing.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.scope.Field
import hachi.lang.domain.scope.Scope
import hachi.lang.util.TypeResolver

class FieldVisitor(private val scope: Scope) : HachiBaseVisitor<Field>() {
    override fun visitField(fieldContext: HachiParser.FieldContext): Field {
        val owner = this.scope.getClassType()
        val type = TypeResolver.getFromTypeContext(fieldContext.type())
        val name = fieldContext.name().text

        return Field(name, owner, type)
    }
}