package hachi.lang.domain

class CompilationUnit(val classDeclaration: ClassDeclaration) {
    fun getClassName(): String {
        return this.classDeclaration.name
    }
}