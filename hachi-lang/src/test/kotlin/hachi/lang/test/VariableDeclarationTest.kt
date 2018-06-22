package hachi.lang.test

import org.junit.Assert
import org.junit.Test

class VariableDeclarationTest : BaseTest() {
    @Test
    fun shouldPrintOne() {
        val output = this.run("VariableDeclaration.hc")

        Assert.assertEquals("1", output)
    }
}