package corgi.lang.domain.scope

import corgi.lang.domain.global.MetaData
import corgi.lang.expression.LocalVariableNotFoundException
import corgi.lang.expression.MethodSignatureNotFoundException

class Scope {
    var localVariables: MutableList<LocalVariable>

    var functionSignatures: MutableList<FunctionSignature>

    var metaData: MetaData

    constructor(metaData: MetaData) {
        this.localVariables = mutableListOf()
        this.functionSignatures = mutableListOf()
        this.metaData = metaData
    }

    constructor(scope: Scope) {
        this.localVariables = mutableListOf()
        this.functionSignatures = ArrayList(scope.functionSignatures)
        this.metaData = scope.metaData
    }

    fun addFunctionSignature(functionSignature: FunctionSignature) {
        this.functionSignatures.add(functionSignature)
    }

    fun getFunctionSignature(methodName: String): FunctionSignature {
        return this.functionSignatures.firstOrNull { it.name == methodName }
                ?: throw MethodSignatureNotFoundException(this, methodName)
    }

    fun addLocalVariable(localVariable: LocalVariable) {
        this.localVariables.add(localVariable)
    }

    fun getLocalVariable(variableName: String): LocalVariable {
        return this.localVariables.firstOrNull { it.name == variableName }
                ?: throw LocalVariableNotFoundException(this, variableName)
    }

    fun getLocalVariableIndex(variableName: String): Int {
        val localVariable = this.getLocalVariable(variableName)

        return this.localVariables.indexOf(localVariable)
    }

    fun getClassName(): String {
        return this.metaData.className
    }

    override fun toString(): String {
        return this.metaData.className
    }
}