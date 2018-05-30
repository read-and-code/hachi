package hachi.lang.domain.type

interface Type {
    fun getName(): String

    fun getTypeClass(): Class<*>?

    fun getDescriptor(): String

    fun getInternalName(): String

    fun getLoadOpcode(): Int

    fun getStoreOpcode(): Int

    fun getReturnOpcode(): Int

    fun getAddOpcode(): Int

    fun getSubtractOpcode(): Int

    fun getMultiplyOpcode(): Int

    fun getDivideOpcode(): Int
}