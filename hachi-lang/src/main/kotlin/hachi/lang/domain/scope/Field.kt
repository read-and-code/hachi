package hachi.lang.domain.scope

import hachi.lang.bytecode.generator.FieldGenerator
import hachi.lang.domain.type.Type

class Field(private val fieldName: String, private val owner: Type, private val fieldType: Type) : Variable {
    override fun getName(): String {
        return this.fieldName
    }

    override fun getType(): Type {
        return this.fieldType
    }

    fun getOwnerInternalName(): String {
        return this.owner.getInternalName()
    }

    fun accept(fieldGenerator: FieldGenerator) {
        fieldGenerator.generate(this)
    }
}