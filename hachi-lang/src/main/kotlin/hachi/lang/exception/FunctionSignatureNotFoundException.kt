package hachi.lang.exception

import hachi.lang.domain.scope.Scope
import hachi.lang.domain.type.Type

class FunctionSignatureNotFoundException(val scope: Scope, private val methodName: String, private val parameterTypes: List<Type>) : CompilationException() {
    override val message: String?
        get() = "There is no method %s in scope %s with parameters %s".format(this.methodName, this.scope, this.parameterTypes)
}