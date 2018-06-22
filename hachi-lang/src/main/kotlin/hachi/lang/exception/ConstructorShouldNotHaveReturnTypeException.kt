package hachi.lang.exception

class ConstructorShouldNotHaveReturnTypeException(private val className: String) : CompilationException() {
    override val message: String?
        get() = "Constructor of type %s should not have return type".format(this.className)
}