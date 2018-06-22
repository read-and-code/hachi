package hachi.lang.parsing.visitor

import hachi.antlr.HachiParser
import hachi.lang.domain.Function
import hachi.lang.domain.scope.LocalVariable
import hachi.lang.domain.scope.Scope

class FunctionVisitor(scope: Scope) : BaseFunctionVisitor<Function>(scope) {
    override fun visitFunction(functionContext: HachiParser.FunctionContext): Function {
        val functionSignature = functionContext.functionDeclaration().accept(FunctionSignatureVisitor(this.scope))

        this.scope.addLocalVariable(LocalVariable("this", this.scope.getClassType()))
        this.addFunctionParametersAsLocalVariables(functionSignature)

        val functionBody = this.getFunctionBody(functionContext)

        return Function(functionSignature, functionBody)
    }
}