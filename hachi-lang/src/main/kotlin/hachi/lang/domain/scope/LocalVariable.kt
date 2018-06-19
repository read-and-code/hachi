package hachi.lang.domain.scope

import hachi.lang.domain.type.Type

class LocalVariable(private val variableName: String, private val variableType: Type) : Variable {
    override fun getName(): String {
        return this.variableName
    }

    override fun getType(): Type {
        return this.variableType
    }
}