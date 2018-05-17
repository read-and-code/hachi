package corgi.lang.exception

import corgi.lang.domain.scope.Scope

class LocalVariableNotFoundException(val scope: Scope, private val variableName: String) : CompilationException() {
    override val message: String?
        get() = "No local variable found for name %s in scope %s".format(this.variableName, this.scope.toString())
}