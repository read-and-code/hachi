package hachi.lang.exception

import hachi.lang.domain.node.expression.FunctionArgument

class FunctionSignatureNotFoundException(private val methodName: String, private val functionArguments: List<FunctionArgument>) : CompilationException() {
    override val message: String?
        get() = "There is no method %s with parameters %s".format(this.methodName, this.functionArguments)
}