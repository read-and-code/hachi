package hachi.lang.domain.scope

import hachi.lang.domain.expression.FunctionParameter
import hachi.lang.domain.type.Type
import hachi.lang.exception.ParameterForNameNotFoundException

class FunctionSignature(val functionName: String, val parameters: List<FunctionParameter>, val returnType: Type) {
    private fun getParameterForName(name: String): FunctionParameter {
        return this.parameters.firstOrNull { it.name == name } ?: throw ParameterForNameNotFoundException()
    }

    fun getIndexOfParameter(parameterName: String): Int {
        val functionParameter = this.getParameterForName(parameterName)

        return this.parameters.indexOf(functionParameter)
    }
}