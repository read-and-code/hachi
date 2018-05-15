package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.global.CompilationUnit

class CompilationUnitVisitor : CorgiBaseVisitor<CompilationUnit>() {
    override fun visitCompilationUnit(compilationUnitContext: CorgiParser.CompilationUnitContext): CompilationUnit {
        val classVisitor = ClassVisitor()
        val classDeclarationContext = compilationUnitContext.classDeclaration()
        val classDeclaration = classDeclarationContext.accept(classVisitor)

        return CompilationUnit(classDeclaration)
    }
}