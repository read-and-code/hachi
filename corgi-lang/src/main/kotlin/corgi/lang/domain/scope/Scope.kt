package corgi.lang.domain.scope

import corgi.lang.domain.global.MetaData

class Scope {
    var localVariables: MutableList<LocalVariable>

    var functionSignatures: MutableList<FunctionSignature>

    lateinit var metaData: MetaData

    constructor(metaData: MetaData) {
        this.localVariables = mutableListOf()
        this.functionSignatures = mutableListOf()
        this.metaData = metaData
    }

    constructor(scope: Scope) {
        this.localVariables = mutableListOf()
        this.functionSignatures = ArrayList(scope.functionSignatures)
    }

    fun addFunctionSignature(functionSignature: FunctionSignature) {
        this.functionSignatures.add(functionSignature)
    }

    fun getFunctionSignature(methodName: String): FunctionSignature {
        return this.functionSignatures.filter { it -> it.name == methodName }
                .first()
    }

    fun addLocalVariable(localVariable: LocalVariable) {
        this.localVariables.add(localVariable)
    }

    fun getLocalVariable(variableName: String): LocalVariable {
        return this.localVariables.filter { it -> it.name == variableName }
                .first()
    }

    fun getLocalVariableIndex(variableName: String): Int {
        val localVariable = this.getLocalVariable(variableName)

        return this.localVariables.indexOf(localVariable)
    }

    fun getClassName(): String {
        return this.metaData.className
    }
}