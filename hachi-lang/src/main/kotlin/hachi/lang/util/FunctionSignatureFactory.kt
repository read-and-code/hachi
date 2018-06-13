package hachi.lang.util

import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.type.BuiltInType
import java.lang.reflect.Constructor
import java.lang.reflect.Method

object FunctionSignatureFactory {
    fun fromMethod(method: Method): FunctionSignature {
        val name = method.name
        val parameters = method.parameters
                .map { FunctionParameter(it.name, TypeResolver.getFromTypeName(it.type.canonicalName), null) }
        val returnType = method.returnType

        return FunctionSignature(name, parameters, TypeResolver.getFromTypeName(returnType.canonicalName))
    }

    fun fromConstructor(constructor: Constructor<*>): FunctionSignature {
        val name = constructor.name
        val parameters = constructor.parameters
                .map { FunctionParameter(name, TypeResolver.getFromTypeName(it.type.canonicalName), null) }

        return FunctionSignature(name, parameters, BuiltInType.VOID)
    }
}