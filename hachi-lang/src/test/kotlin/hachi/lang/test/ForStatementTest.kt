package hachi.lang.test

import org.junit.Assert
import org.junit.Test

class ForStatementTest : BaseTest() {
    @Test
    fun shouldPrintOneToFive() {
        val output = this.run("ForStatement.hc")

        Assert.assertEquals(listOf("1", "2", "3", "4", "5"), output)
    }
}