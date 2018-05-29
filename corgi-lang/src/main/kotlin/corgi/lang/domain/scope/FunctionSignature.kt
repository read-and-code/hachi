package corgi.lang.domain.scope

import corgi.lang.domain.expression.FunctionParameter
import corgi.lang.domain.type.Type
import corgi.lang.exception.ParameterForNameNotFoundException

class FunctionSignature(val functionName: String, val parameters: List<FunctionParameter>, val returnType: Type) {
    private fun getParameterForName(name: String): FunctionParameter {
        return this.parameters.firstOrNull { it.name == name } ?: throw ParameterForNameNotFoundException()
    }

    fun getIndexOfParameter(parameterName: String): Int {
        val functionParameter = this.getParameterForName(parameterName)

        return this.parameters.indexOf(functionParameter)
    }
}