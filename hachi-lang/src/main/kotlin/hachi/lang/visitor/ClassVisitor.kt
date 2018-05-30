package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.global.ClassDeclaration
import hachi.lang.domain.global.MetaData
import hachi.lang.domain.scope.Scope

class ClassVisitor : HachiBaseVisitor<ClassDeclaration>() {
    lateinit var scope: Scope

    override fun visitClassDeclaration(classDeclarationContext: HachiParser.ClassDeclarationContext): ClassDeclaration {
        val className = classDeclarationContext.className().text
        val functionContexts = classDeclarationContext.classBody().function()
        val metaData = MetaData(classDeclarationContext.className().text)

        this.scope = Scope(metaData)

        val functionSignatureVisitor = FunctionSignatureVisitor(this.scope)

        functionContexts.map { it.functionDeclaration().accept(functionSignatureVisitor) }
                .forEach { this.scope.addFunctionSignature(it) }

        val methods = functionContexts.map { it.accept(FunctionVisitor(this.scope)) }

        return ClassDeclaration(className, methods)
    }
}