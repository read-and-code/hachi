package hachi.lang.exception

import hachi.lang.domain.scope.Scope

class FunctionSignatureNotFoundException(val scope: Scope, private val methodName: String) : CompilationException() {
    override val message: String?
        get() = "There is no method %s in scope %s".format(this.methodName, this.scope.toString())
}