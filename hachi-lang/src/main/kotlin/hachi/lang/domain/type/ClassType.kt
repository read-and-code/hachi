package hachi.lang.domain.type

import jdk.internal.org.objectweb.asm.Opcodes

class ClassType(private var name: String) : Type {
    override fun getName(): String {
        return this.name
    }

    override fun getTypeClass(): Class<*> {
        return Class.forName(this.name)
    }

    override fun getDescriptor(): String {
        return "L" + this.getInternalName() + ";"
    }

    override fun getInternalName(): String {
        return this.name.replace(".", "/")
    }

    override fun getLoadOpcode(): Int {
        return Opcodes.ALOAD
    }

    override fun getStoreOpcode(): Int {
        return Opcodes.ASTORE
    }

    override fun getReturnOpcode(): Int {
        return Opcodes.ARETURN
    }

    override fun getAddOpcode(): Int {
        throw UnsupportedOperationException()
    }

    override fun getSubtractOpcode(): Int {
        throw UnsupportedOperationException()
    }

    override fun getMultiplyOpcode(): Int {
        throw UnsupportedOperationException()
    }

    override fun getDivideOpcode(): Int {
        throw UnsupportedOperationException()
    }
}