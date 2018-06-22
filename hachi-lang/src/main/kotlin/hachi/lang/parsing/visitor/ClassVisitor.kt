package hachi.lang.parsing.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.ClassDeclaration
import hachi.lang.domain.Constructor
import hachi.lang.domain.MetaData
import hachi.lang.domain.node.statement.BlockStatement
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.type.BuiltInType

class ClassVisitor : HachiBaseVisitor<ClassDeclaration>() {
    lateinit var scope: Scope

    override fun visitClassDeclaration(classDeclarationContext: HachiParser.ClassDeclarationContext): ClassDeclaration {
        val metaData = MetaData(classDeclarationContext.className().text, "java.lang.Object")

        this.scope = Scope(metaData)

        val className = classDeclarationContext.className().text
        val fieldVisitor = FieldVisitor(this.scope)
        val fields = classDeclarationContext.classBody()
                .field()
                .map { it ->
                    val field = it.accept(fieldVisitor)

                    this.scope.addField(field)

                    field
                }

        val functionSignatureVisitor = FunctionSignatureVisitor(this.scope)
        val functionContexts = classDeclarationContext.classBody().function()

        functionContexts.map { it.functionDeclaration().accept(functionSignatureVisitor) }
                .forEach { this.scope.addFunctionSignature(it) }

        val defaultConstructorExists = this.scope.zeroParameterFunctionSignatureExists(className)

        if (!defaultConstructorExists) {
            this.addDefaultConstructorSignatureToScope(className)
        }

        val methods = functionContexts.map { it.accept(FunctionVisitor(this.scope)) }
                .toMutableList()

        if (!defaultConstructorExists) {
            methods.add(this.getDefaultConstructor())
        }

        return ClassDeclaration(className, fields, methods)
    }

    private fun getDefaultConstructor(): Constructor {
        val functionSignature = this.scope.getFunctionSignatureWithoutParameters(this.scope.getClassName())

        return Constructor(functionSignature, BlockStatement(scope))
    }

    private fun addDefaultConstructorSignatureToScope(name: String) {
        val constructorSignature = FunctionSignature(name, emptyList(), BuiltInType.VOID)

        this.scope.addFunctionSignature(constructorSignature)
    }
}