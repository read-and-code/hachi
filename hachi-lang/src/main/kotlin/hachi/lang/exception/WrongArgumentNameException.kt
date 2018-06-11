package hachi.lang.exception

import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.domain.node.expression.FunctionParameter

class WrongArgumentNameException(private val functionArgument: FunctionArgument, private val functionParameters: List<FunctionParameter>) : CompilationException() {
    override val message: String?
        get() = "You are trying to call method with functionArgument name %s where parameters = %s".format(this.functionArgument.parameterName, this.functionParameters)
}