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

    fun matches(otherSignatureName: String, otherSignatureParameterTypes: List<Type>): Boolean {
        val areNamesEqual = this.functionName == otherSignatureName

        if (!areNamesEqual) {
            return false
        }

        val parameterTypes = this.parameters.map { it.getType() }

        return parameterTypes.containsAll(otherSignatureParameterTypes) && otherSignatureParameterTypes.containsAll(parameterTypes)
    }
}