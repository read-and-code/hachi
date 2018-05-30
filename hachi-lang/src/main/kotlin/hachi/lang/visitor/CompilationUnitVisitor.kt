package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.global.CompilationUnit

class CompilationUnitVisitor : HachiBaseVisitor<CompilationUnit>() {
    override fun visitCompilationUnit(compilationUnitContext: HachiParser.CompilationUnitContext): CompilationUnit {
        val classVisitor = ClassVisitor()
        val classDeclarationContext = compilationUnitContext.classDeclaration()
        val classDeclaration = classDeclarationContext.accept(classVisitor)

        return CompilationUnit(classDeclaration)
    }
}