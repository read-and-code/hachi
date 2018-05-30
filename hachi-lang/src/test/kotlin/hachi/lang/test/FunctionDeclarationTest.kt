package hachi.lang.test

import org.junit.Assert
import org.junit.Test

class FunctionDeclarationTest : BaseTest() {
    @Test
    fun shouldParseFunctionSum() {
        val compilationUnit = this.getCompilationUnit("function-declaration.hc")
        val classDeclaration = compilationUnit.classDeclaration
        val methods = classDeclaration.methods
        val sum = methods.firstOrNull { it.getName() == "sum" }

        Assert.assertNotNull(sum)
    }
}