package hachi.lang.domain.type

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
}