package hachi.lang.test

import org.junit.Assert
import org.junit.Test

class ClassDeclarationTest : BaseTest() {
    @Test
    fun shouldReturnClassName() {
        val compilationUnit = this.getCompilationUnit("EmptyClass.hc")
        val classDeclaration = compilationUnit.classDeclaration

        Assert.assertEquals("App", classDeclaration.name)
    }
}