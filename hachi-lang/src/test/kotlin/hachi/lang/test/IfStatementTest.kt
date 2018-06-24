package hachi.lang.test

import org.junit.Assert
import org.junit.Test

class IfStatementTest : BaseTest() {
    @Test
    fun shouldPrintTrue() {
        val output = this.run("IfStatement.hc")

        Assert.assertEquals(listOf("true"), output)
    }
}