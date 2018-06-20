package hachi.lang.parsing.visitor.expression

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.FieldReference
import hachi.lang.domain.node.expression.LocalVariableReference
import hachi.lang.domain.node.expression.Reference
import hachi.lang.domain.scope.Scope

class VariableReferenceExpressionVisitor(private val scope: Scope) : HachiBaseVisitor<Reference>() {
    override fun visitVariableReference(variableReferenceContext: HachiParser.VariableReferenceContext): Reference {
        val variableName = variableReferenceContext.text

        return if (this.scope.fieldExists(variableName)) {
            val field = this.scope.getField(variableName)

            FieldReference(field)
        } else {
            val localVariable = this.scope.getLocalVariable(variableName)

            LocalVariableReference(localVariable)
        }
    }
}