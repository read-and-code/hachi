package hachi.lang.domain.`class`

import hachi.lang.bytecode.generator.MethodGenerator
import hachi.lang.domain.expression.FunctionParameter
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.statement.Statement
import hachi.lang.domain.type.Type

open class Function(private val functionSignature: FunctionSignature, val functionBody: Statement) {
    fun getName(): String {
        return this.functionSignature.functionName
    }

    fun getParameters(): List<FunctionParameter> {
        return this.functionSignature.parameters
    }

    open fun getReturnType(): Type {
        return this.functionSignature.returnType
    }

    open fun accept(methodGenerator: MethodGenerator) {
        methodGenerator.generate(this)
    }
}