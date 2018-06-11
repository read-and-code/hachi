package hachi.lang.domain.scope

import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.domain.node.expression.FunctionParameter
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

    fun matches(otherSignatureName: String, functionArguments: List<FunctionArgument>): Boolean {
        val areNamesEqual = this.functionName == otherSignatureName

        if (!areNamesEqual) {
            return false
        }

        val nonDefaultParametersCount = this.parameters.count { it.defaultValue != null }

        if (nonDefaultParametersCount > functionArguments.size) {
            return false
        }

        val isNamedArgumentList = functionArguments.any { it.parameterName != null }

        if (isNamedArgumentList) {
            return functionArguments.all {
                val parameterName = it.parameterName

                this.parameters.map { it.name }.any { it == parameterName }
            }
        } else {
            return (0..(functionArguments.size - 1)).all { functionArguments[it].getType() == this.parameters[it].getType() }
        }
    }
}