package hachi.lang.exception

class ClassNotFoundForNameException(private val className: String) : CompilationException() {
    override val message: String?
        get() = "Class not found %s".format(this.className)
}