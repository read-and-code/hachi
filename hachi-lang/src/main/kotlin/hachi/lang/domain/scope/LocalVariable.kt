package hachi.lang.domain.scope

import hachi.lang.domain.type.Type

class LocalVariable(private val name: String, private val type: Type) : Variable {
    override fun getName(): String {
        return this.name
    }

    override fun getType(): Type {
        return this.type
    }
}