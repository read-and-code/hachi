package corgi.lang.util

import corgi.lang.domain.`class`.Function
import corgi.lang.domain.expression.FunctionParameter
import corgi.lang.domain.scope.FunctionSignature
import corgi.lang.domain.type.Type

object DescriptorFactory {
    fun getMethodDescriptor(function: Function): String {
        return this.getMethodDescriptor(function.getParameters(), function.getReturnType())
    }

    fun getMethodDescriptor(functionSignature: FunctionSignature): String {
        return this.getMethodDescriptor(functionSignature.parameters, functionSignature.returnType)
    }

    private fun getMethodDescriptor(arguments: Collection<FunctionParameter>, returnType: Type): String {
        val argumentDescriptors = arguments.map { it.type.getDescriptor() }
                .joinToString("", "(", ")")

        return argumentDescriptors + returnType.getDescriptor()
    }
}