package hachi.lang.exception

import hachi.lang.domain.node.expression.Argument

class MethodSignatureNotFoundException(private val methodName: String, private val arguments: List<Argument>) : CompilationException() {
    override val message: String?
        get() = "There is no method %s with arguments %s".format(this.methodName, this.arguments)
}