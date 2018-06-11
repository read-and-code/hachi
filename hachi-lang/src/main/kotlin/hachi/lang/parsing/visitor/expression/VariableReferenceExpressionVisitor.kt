package hachi.lang.parsing.visitor.expression

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.VariableReference
import hachi.lang.domain.scope.Scope

class VariableReferenceExpressionVisitor(val scope: Scope) : HachiBaseVisitor<VariableReference>() {
    override fun visitVariableReference(variableReferenceContext: HachiParser.VariableReferenceContext): VariableReference {
        val variableName = variableReferenceContext.text
        val localVariable = this.scope.getLocalVariable(variableName)

        return VariableReference(variableName, localVariable.type)
    }
}