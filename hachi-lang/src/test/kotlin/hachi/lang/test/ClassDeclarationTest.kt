package hachi.lang.test

import org.junit.Assert
import org.junit.Test

class ClassDeclarationTest : BaseTest() {
    @Test
    fun shouldReturnClassName() {
        val compilationUnit = this.getCompilationUnit("empty-class.hc")
        val classDeclaration = compilationUnit.classDeclaration

        Assert.assertEquals("app", classDeclaration.name)
    }
}