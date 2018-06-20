package hachi.lang.exception

import hachi.lang.domain.type.Type

class MixedComparisonNotAllowedException(private val leftType: Type, private val rightType: Type) : CompilationException() {
    override val message: String?
        get() = "Comparison between object and primitive is not supported: %s | %s".format(this.leftType, this.rightType)
}