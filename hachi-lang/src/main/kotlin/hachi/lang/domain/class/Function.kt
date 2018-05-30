package hachi.lang.domain.`class`

import hachi.lang.domain.expression.FunctionParameter
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.statement.Statement
import hachi.lang.domain.type.Type

class Function(private val functionSignature: FunctionSignature, val functionBody: Statement) {
    fun getName(): String {
        return this.functionSignature.functionName
    }

    fun getParameters(): List<FunctionParameter> {
        return this.functionSignature.parameters
    }

    fun getReturnType(): Type {
        return this.functionSignature.returnType
    }
}