package hachi.lang.exception

import hachi.lang.domain.scope.FunctionSignature

class MethodWithNameAlreadyDefinedException(val functionSignature: FunctionSignature) : CompilationException() {
    override val message: String?
        get() = "Method already defined in scope %s".format(this.functionSignature)
}