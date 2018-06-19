package hachi.lang.domain.scope

import hachi.lang.domain.MetaData
import hachi.lang.domain.node.expression.FunctionArgument
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.ClassType
import hachi.lang.domain.type.Type
import hachi.lang.exception.FieldNotFoundException
import hachi.lang.exception.FunctionSignatureNotFoundException
import hachi.lang.exception.LocalVariableNotFoundException
import hachi.lang.exception.MethodWithNameAlreadyDefinedException

class Scope {
    var metaData: MetaData

    var functionSignatures: MutableList<FunctionSignature>

    var localVariables: MutableList<LocalVariable>

    var fields: MutableList<Field>

    constructor(metaData: MetaData) {
        this.metaData = metaData
        this.functionSignatures = mutableListOf()
        this.localVariables = mutableListOf()
        this.fields = mutableListOf()
    }

    constructor(scope: Scope) {
        this.metaData = scope.metaData
        this.functionSignatures = ArrayList(scope.functionSignatures)
        this.localVariables = ArrayList(scope.localVariables)
        this.fields = ArrayList(scope.fields)
    }

    fun addFunctionSignature(functionSignature: FunctionSignature) {
        if (this.zeroParameterFunctionSignatureExists(functionSignature.functionName)) {
            throw MethodWithNameAlreadyDefinedException(functionSignature)
        }

        this.functionSignatures.add(functionSignature)
    }

    fun zeroParameterFunctionSignatureExists(identifier: String): Boolean {
        return this.functionSignatureExists(identifier, emptyList())
    }

    private fun functionSignatureExists(identifier: String, functionArguments: List<FunctionArgument>): Boolean {
        if (identifier == "super") {
            return true
        }

        return this.functionSignatures.any { it.matches(identifier, functionArguments) }
    }

    fun getConstructorCallSignature(className: String, functionArguments: List<FunctionArgument>): FunctionSignature {
        val isDifferentThanCurrentClass = className != this.getClassName()

        if (isDifferentThanCurrentClass) {
            val argumentTypes = functionArguments.map { it.getType() }

            return ClassPathScope().getConstructorSignature(className, argumentTypes)
                    ?: throw FunctionSignatureNotFoundException(className, functionArguments)
        }

        return this.getConstructorCallSignatureForCurrentClass(functionArguments)
    }

    fun getConstructorCallSignatureForCurrentClass(functionArguments: List<FunctionArgument>): FunctionSignature {
        return this.getFunctionCallSignature(null, this.getClassName(), functionArguments)
    }

    fun getFunctionSignatureWithoutParameters(identifier: String): FunctionSignature {
        return this.getFunctionCallSignature(identifier, emptyList())
    }

    fun getFunctionCallSignature(owner: Type?, functionName: String, functionArguments: List<FunctionArgument>): FunctionSignature {
        val isDifferentThanCurrentClass = owner != null && owner.getName() != this.getClassName()

        if (isDifferentThanCurrentClass) {
            val argumentTypes = functionArguments.map { it.getType() }

            return ClassPathScope().getFunctionSignature(owner, functionName, argumentTypes)
                    ?: throw FunctionSignatureNotFoundException(functionName, functionArguments)
        }

        return this.getFunctionCallSignature(functionName, functionArguments)
    }

    fun getFunctionCallSignature(identifier: String, functionArguments: List<FunctionArgument>): FunctionSignature {
        if (identifier == "super") {
            return FunctionSignature("super", emptyList(), BuiltInType.VOID)
        }

        return this.functionSignatures.firstOrNull { it.matches(identifier, functionArguments) }
                ?: throw FunctionSignatureNotFoundException(identifier, functionArguments)
    }

    fun localVariableExists(variableName: String): Boolean {
        return this.localVariables.any { it.getName() == variableName }
    }

    fun addLocalVariable(localVariable: LocalVariable) {
        this.localVariables.add(localVariable)
    }

    fun getLocalVariable(variableName: String): LocalVariable {
        return this.localVariables.firstOrNull { it.getName() == variableName }
                ?: throw LocalVariableNotFoundException(this, variableName)
    }

    fun getLocalVariableIndex(variableName: String): Int {
        val localVariable = this.getLocalVariable(variableName)

        return this.localVariables.indexOf(localVariable)
    }

    fun fieldExists(fieldName: String): Boolean {
        return this.fields.any { it.getName() == fieldName }
    }

    fun addField(field: Field) {
        this.fields.add(field)
    }

    fun getField(fieldName: String): Field {
        return this.fields.firstOrNull { it.getName() == fieldName } ?: throw FieldNotFoundException(this, fieldName)
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

    override fun toString(): String {
        return this.metaData.className
    }
}