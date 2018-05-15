package corgi.lang.expression

import corgi.lang.domain.expression.FunctionCall

class CalledFunctionDoesNotExistException(val functionCall: FunctionCall) : CompilationException() {
    override val message: String?
        get() = "Called function %s does not exist".format(this.functionCall.toString())
}