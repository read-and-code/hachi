package hachi.lang.exception

import hachi.lang.domain.scope.Scope

class FieldNotFoundException(private val scope: Scope, private val fieldName: String) : CompilationException() {
    override val message: String?
        get() = "No field found for name %s in scope %s".format(this.fieldName, this.scope)
}