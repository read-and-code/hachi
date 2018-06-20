package hachi.lang.domain.scope

import hachi.lang.domain.type.Type
import hachi.lang.util.FunctionSignatureFactory
import org.apache.commons.lang3.reflect.ConstructorUtils
import org.apache.commons.lang3.reflect.MethodUtils

class ClassPathScope {
    fun getFunctionSignature(owner: Type?, functionName: String, arguments: List<Type>): FunctionSignature? {
        return try {
            val methodOwnerClass = owner?.getTypeClass()
            val parameters = arguments.map { it.getTypeClass() }
                    .toTypedArray()
            val method = MethodUtils.getMatchingAccessibleMethod(methodOwnerClass, functionName, *parameters)

            FunctionSignatureFactory.fromMethod(method)
        } catch (e: Exception) {
            null
        }
    }

    fun getConstructorSignature(className: String, arguments: List<Type>): FunctionSignature? {
        return try {
            val methodOwnerClass = Class.forName(className)
            val parameters = arguments.map { it.getTypeClass() }
                    .toTypedArray()
            val constructor = ConstructorUtils.getMatchingAccessibleConstructor(methodOwnerClass, *parameters)

            return FunctionSignatureFactory.fromConstructor(constructor)
        } catch (e: Exception) {
            null
        }
    }
}