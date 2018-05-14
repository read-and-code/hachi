package corgi.lang.domain.global

class CompilationUnit(val classDeclaration: ClassDeclaration) {
    fun getClassName(): String {
        return this.classDeclaration.name
    }
}