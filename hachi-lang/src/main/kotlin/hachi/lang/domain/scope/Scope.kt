package hachi.lang.domain.scope

import hachi.lang.domain.MetaData
import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.ClassType
import hachi.lang.domain.type.Type
import hachi.lang.exception.FunctionSignatureNotFoundException
import hachi.lang.exception.LocalVariableNotFoundException
import hachi.lang.exception.MethodWithNameAlreadyDefinedException

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
        if (this.parameterLessSignatureExists(functionSignature.functionName)) {
            throw MethodWithNameAlreadyDefinedException(functionSignature)
        }

        this.functionSignatures.add(functionSignature)
    }

    fun parameterLessSignatureExists(identifier: String): Boolean {
        return this.signatureExists(identifier, emptyList())
    }

    private fun signatureExists(identifier: String, functionArguments: List<FunctionArgument>): Boolean {
        if (identifier == "super") {
            return true
        }

        return this.functionSignatures.any { it.matches(identifier, functionArguments) }
    }

    fun getMethodCallSignatureWithoutParameters(identifier: String): FunctionSignature {
        return this.getMethodCallSignature(identifier, emptyList<FunctionArgument>())
    }

    fun getMethodCallSignature(identifier: String, functionArguments: List<FunctionArgument>): FunctionSignature {
        if (identifier == "super") {
            return FunctionSignature("super", emptyList(), BuiltInType.VOID)
        }

        return this.functionSignatures.firstOrNull { it.matches(identifier, functionArguments) }
                ?: throw FunctionSignatureNotFoundException(identifier, functionArguments)
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