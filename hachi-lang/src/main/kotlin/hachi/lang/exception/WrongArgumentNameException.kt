package hachi.lang.exception

import hachi.lang.domain.node.expression.Argument
import hachi.lang.domain.node.expression.FunctionParameter

class WrongArgumentNameException(private val argument: Argument, private val functionParameters: List<FunctionParameter>) : CompilationException() {
    override val message: String?
        get() = "You are trying to call method with argument name %s where parameters = %s".format(this.argument.parameterName, this.functionParameters)
}