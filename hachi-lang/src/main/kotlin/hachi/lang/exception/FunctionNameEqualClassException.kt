package hachi.lang.exception

class FunctionNameEqualClassException(private val functionName: String) : CompilationException() {
    override val message: String?
        get() = "Function name cannot be same as the class %s".format(this.functionName)
}