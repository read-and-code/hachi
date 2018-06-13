package hachi.lang.parsing.visitor

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.ClassDeclaration
import hachi.lang.domain.Constructor
import hachi.lang.domain.Function
import hachi.lang.domain.MetaData
import hachi.lang.domain.node.expression.ConstructorCall
import hachi.lang.domain.node.expression.FunctionCall
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.node.statement.BlockStatement
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.scope.Scope
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

        val defaultConstructorExists = this.scope.zeroParameterFunctionSignatureExists(className)

        this.addDefaultConstructorSignatureToScope(className, defaultConstructorExists)

        val methods = functionContexts.map { it.accept(FunctionVisitor(this.scope)) }
                .toMutableList()

        if (!defaultConstructorExists) {
            methods.add(this.getDefaultConstructor())
        }

        val isStartMethodDefined = this.scope.zeroParameterFunctionSignatureExists("start")

        if (isStartMethodDefined) {
            methods.add(this.getGeneratedMainMethod())
        }

        return ClassDeclaration(className, methods)
    }

    private fun getDefaultConstructor(): Constructor {
        val functionSignature = this.scope.getFunctionSignatureWithoutParameters(this.scope.getClassName())

        return Constructor(functionSignature, BlockStatement(scope))
    }

    private fun getGeneratedMainMethod(): Function {
        val functionParameter = FunctionParameter("args", BuiltInType.STRING_ARRAY, null)
        val functionSignature = FunctionSignature("main", listOf(functionParameter), BuiltInType.VOID)
        val constructorCall = ConstructorCall(this.scope.getClassName())
        val startFunctionSignature = FunctionSignature("start", emptyList(), BuiltInType.VOID)
        val startFunctionCall = FunctionCall(startFunctionSignature, emptyList(), this.scope.getClassType())
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