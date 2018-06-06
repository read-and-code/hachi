package hachi.lang.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.`class`.Constructor
import hachi.lang.domain.`class`.Function
import hachi.lang.domain.expression.ConstructorCall
import hachi.lang.domain.expression.FunctionCall
import hachi.lang.domain.expression.FunctionParameter
import hachi.lang.domain.global.ClassDeclaration
import hachi.lang.domain.global.MetaData
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.scope.Scope
import hachi.lang.domain.statement.BlockStatement
import hachi.lang.domain.type.BuiltInType

class ClassVisitor : HachiBaseVisitor<ClassDeclaration>() {
    lateinit var scope: Scope

    override fun visitClassDeclaration(classDeclarationContext: HachiParser.ClassDeclarationContext): ClassDeclaration {
        val className = classDeclarationContext.className().text
        val functionContexts = classDeclarationContext.classBody().function()
        val metaData = MetaData(classDeclarationContext.className().text, "java.lang.Object")

        this.scope = Scope(metaData)

        val functionSignatureVisitor = FunctionSignatureVisitor(this.scope)

        functionContexts.map { it.functionDeclaration().accept(functionSignatureVisitor) }
                .forEach { this.scope.addFunctionSignature(it) }

        val defaultConstructorExists = this.scope.parameterLessSignatureExists(className)

        this.addDefaultConstructorSignatureToScope(className, defaultConstructorExists)

        val methods = functionContexts.map { it.accept(FunctionVisitor(this.scope)) }
                .toMutableList()

        if (!defaultConstructorExists) {
            methods.add(this.getDefaultConstructor())
        }

        methods.add(this.getMainMethod())

        return ClassDeclaration(className, methods)
    }

    private fun getDefaultConstructor(): Constructor {
        val functionSignature = this.scope.getMethodCallSignatureWithoutParameters(this.scope.getClassName())

        return Constructor(functionSignature, BlockStatement(scope))
    }

    private fun getMainMethod(): Function {
        val functionParameter = FunctionParameter("args", null, BuiltInType.STRING_ARRAY)
        val functionSignature = FunctionSignature("main", listOf(functionParameter), BuiltInType.VOID)
        val constructorCall = ConstructorCall(this.scope.getClassName())
        val startFunctionSignature = FunctionSignature("start", emptyList(), BuiltInType.VOID)
        val startFunctionCall = FunctionCall(this.scope.getClassType(), startFunctionSignature, emptyList())
        val blockStatement = BlockStatement(Scope(this.scope), listOf(constructorCall, startFunctionCall))

        return Function(functionSignature, blockStatement)
    }

    private fun addDefaultConstructorSignatureToScope(name: String, defaultConstructorExists: Boolean) {
        if (!defaultConstructorExists) {
            val constructorSignature = FunctionSignature(name, emptyList(), BuiltInType.VOID)

            this.scope.addFunctionSignature(constructorSignature)
        }
    }
}