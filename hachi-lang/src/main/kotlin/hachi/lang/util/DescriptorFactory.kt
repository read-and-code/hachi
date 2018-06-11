package hachi.lang.util

import hachi.lang.domain.Function
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.type.Type

object DescriptorFactory {
    fun getMethodDescriptor(function: Function): String {
        return this.getMethodDescriptor(function.getParameters(), function.getReturnType())
    }

    fun getMethodDescriptor(functionSignature: FunctionSignature): String {
        return this.getMethodDescriptor(functionSignature.parameters, functionSignature.returnType)
    }

    private fun getMethodDescriptor(arguments: Collection<FunctionParameter>, returnType: Type): String {
        val argumentDescriptors = arguments.map { it.getType().getDescriptor() }
                .joinToString("", "(", ")")

        return argumentDescriptors + returnType.getDescriptor()
    }
}