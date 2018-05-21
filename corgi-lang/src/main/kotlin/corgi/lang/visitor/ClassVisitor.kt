package corgi.lang.visitor

import corgi.antlr.CorgiBaseVisitor
import corgi.antlr.CorgiParser
import corgi.lang.domain.global.ClassDeclaration
import corgi.lang.domain.global.MetaData
import corgi.lang.domain.scope.Scope

class ClassVisitor : CorgiBaseVisitor<ClassDeclaration>() {
    lateinit var scope: Scope

    override fun visitClassDeclaration(classDeclarationContext: CorgiParser.ClassDeclarationContext): ClassDeclaration {
        val className = classDeclarationContext.className().text
        val functionSignatureVisitor = FunctionSignatureVisitor()
        val functionContexts = classDeclarationContext.classBody().function()
        val metaData = MetaData(classDeclarationContext.className().text)

        this.scope = Scope(metaData)

        functionContexts.map { it.functionDeclaration().accept(functionSignatureVisitor) }
                .forEach { this.scope.addFunctionSignature(it) }

        val methods = functionContexts.map { it.accept(FunctionVisitor(this.scope)) }

        return ClassDeclaration(className, methods)
    }
}