package hachi.lang.domain.type

interface Type {
    fun getName(): String

    fun getTypeClass(): Class<*>?

    fun getDescriptor(): String

    fun getInternalName(): String
}