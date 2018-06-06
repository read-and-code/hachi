package hachi.lang.domain.scope

import hachi.lang.domain.expression.Expression
import hachi.lang.domain.global.MetaData
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.ClassType
import hachi.lang.domain.type.Type
import hachi.lang.exception.FunctionSignatureNotFoundException
import hachi.lang.exception.LocalVariableNotFoundException

class Scope {
    var localVariables: MutableList<LocalVariable>

    var functionSignatures: MutableList<FunctionSignature>

    var metaData: MetaData

    constructor(metaData: MetaData) {
        this.localVariables = mutableListOf()
        this.functionSignatures = mutableListOf()
        this.metaData = metaData
    }

    constructor(scope: Scope) {
        this.localVariables = ArrayList(scope.localVariables)
        this.functionSignatures = ArrayList(scope.functionSignatures)
        this.metaData = scope.metaData
    }

    fun addFunctionSignature(functionSignature: FunctionSignature) {
        this.functionSignatures.add(functionSignature)
    }

    fun parameterLessSignatureExists(identifier: String): Boolean {
        return this.signatureExists(identifier, emptyList())
    }

    fun signatureExists(identifier: String, parameterTypes: List<Type>): Boolean {
        if (identifier == "super") {
            return true
        }

        return this.functionSignatures.any { it.matches(identifier, parameterTypes) }
    }

    fun getMethodCallSignatureWithoutParameters(identifier: String): FunctionSignature {
        return this.getMethodCallSignature(identifier, emptyList<Type>())
    }

    fun getMethodCallSignature(identifier: String, arguments: Collection<Expression>): FunctionSignature {
        val argumentTypes = arguments.map { it.getType() }

        return this.getMethodCallSignature(identifier, argumentTypes)
    }

    fun getMethodCallSignature(identifier: String, parameterTypes: List<Type>): FunctionSignature {
        return when (identifier) {
            "super" -> FunctionSignature("super", emptyList(), BuiltInType.VOID)
            else -> this.functionSignatures.firstOrNull { it.matches(identifier, parameterTypes) }
                    ?: throw FunctionSignatureNotFoundException(this, identifier, parameterTypes)
        }
    }

    fun addLocalVariable(localVariable: LocalVariable) {
        this.localVariables.add(localVariable)
    }

    fun getLocalVariable(variableName: String): LocalVariable {
        return this.localVariables.firstOrNull { it.name == variableName }
                ?: throw LocalVariableNotFoundException(this, variableName)
    }

    fun getLocalVariableIndex(variableName: String): Int {
        val localVariable = this.getLocalVariable(variableName)

        return this.localVariables.indexOf(localVariable)
    }

    fun getClassName(): String {
        return this.metaData.className
    }

    fun getSuperClassName(): String {
        return this.metaData.superClassName
    }

    fun getClassType(): Type {
        return ClassType(this.getClassName())
    }

    fun getClassInternalName(): String {
        return this.getClassType().getInternalName()
    }

    fun getSuperClassInternalName(): String {
        return ClassType(this.getSuperClassName()).getInternalName()
    }

    fun localVariableExists(variableName: String): Boolean {
        return this.localVariables.any { it.name == variableName }
    }

    override fun toString(): String {
        return this.metaData.className
    }
}