package corgi.lang.domain.`class`

import corgi.lang.domain.expression.FunctionParameter
import corgi.lang.domain.scope.FunctionSignature
import corgi.lang.domain.statement.Statement
import corgi.lang.domain.type.Type

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