package hachi.lang.domain.scope

import hachi.lang.bytecode.generator.FieldGenerator
import hachi.lang.domain.type.Type

class Field(private val name: String, private val owner: Type, private val type: Type) : Variable {
    override fun getName(): String {
        return this.name
    }

    override fun getType(): Type {
        return this.type
    }

    fun getOwnerInternalName(): String {
        return this.owner.getInternalName()
    }

    fun accept(fieldGenerator: FieldGenerator) {
        fieldGenerator.generate(this)
    }
}