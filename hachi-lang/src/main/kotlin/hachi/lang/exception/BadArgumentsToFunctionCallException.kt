package hachi.lang.exception

import hachi.lang.domain.node.expression.Call

class BadArgumentsToFunctionCallException(private val call: Call) : CompilationException() {
    override val message: String?
        get() = "You called function with bad arguments %s".format(this.call)
}