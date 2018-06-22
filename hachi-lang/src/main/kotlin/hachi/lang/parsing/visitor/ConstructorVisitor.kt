package hachi.lang.parsing.visitor

import hachi.antlr.HachiParser
import hachi.lang.domain.Constructor
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope

class ConstructorVisitor(scope: Scope) : BaseFunctionVisitor<Constructor>(scope) {
    override fun visitConstructor(constructorContext: HachiParser.ConstructorContext): Constructor {
        val functionSignature = constructorContext.constructorDeclaration().accept(FunctionSignatureVisitor(this.scope))

        this.scope.addLocalVariable(LocalVariable("this", this.scope.getClassType()))
        this.addFunctionParametersAsLocalVariables(functionSignature)

        val functionBody = this.getFunctionBody(constructorContext)

        return Constructor(functionSignature, functionBody)
    }
}