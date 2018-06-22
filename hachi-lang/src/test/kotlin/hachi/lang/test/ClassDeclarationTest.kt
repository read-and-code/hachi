package hachi.lang.test

import org.junit.Assert
import org.junit.Test

class ClassDeclarationTest : BaseTest() {
    @Test
    fun shouldReturnClassName() {
        val compilationUnit = this.getCompilationUnit("ClassDeclaration.hc")
        val classDeclaration = compilationUnit.classDeclaration

        Assert.assertEquals("ClassDeclaration", classDeclaration.name)
    }
}