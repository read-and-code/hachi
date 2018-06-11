package hachi.lang.domain

import hachi.lang.bytecode.generator.MethodGenerator
import hachi.lang.domain.node.statement.Statement
import hachi.lang.domain.scope.FunctionSignature
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.Type

class Constructor(functionSignature: FunctionSignature, constructorBody: Statement) : Function(functionSignature, constructorBody) {
    override fun getReturnType(): Type {
        return BuiltInType.VOID
    }

    override fun accept(methodGenerator: MethodGenerator) {
        methodGenerator.generate(this)
    }
}