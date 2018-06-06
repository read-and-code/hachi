package hachi.lang.util

import hachi.lang.domain.expression.FunctionParameter
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.type.ClassType
import java.lang.reflect.Constructor
import java.lang.reflect.Method

object ReflectionObjectToSignatureMapper {
    fun fromMethod(method: Method): FunctionSignature {
        val name = method.name
        val parameters = method.parameters
                .map { FunctionParameter(it.name, null, ClassType(it.type.canonicalName)) }
        val returnType = method.returnType

        return FunctionSignature(name, parameters, ClassType(returnType.canonicalName))
    }

    fun fromConstructor(constructor: Constructor<*>): FunctionSignature {
        val name = constructor.name
        val parameters = constructor.parameters
                .map { FunctionParameter(name, null, ClassType(it.type.canonicalName)) }
        val returnType = constructor.declaringClass

        return FunctionSignature(name, parameters, ClassType(returnType.canonicalName))
    }
}