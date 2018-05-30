package hachi.lang.exception

import hachi.lang.domain.expression.FunctionCall

class CalledFunctionDoesNotExistException(private val functionCall: FunctionCall) : CompilationException() {
    override val message: String?
        get() = "Called function %s does not exist".format(this.functionCall.toString())
}