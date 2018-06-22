package hachi.lang.test

import org.junit.Assert
import org.junit.Test

class ConstructorTest : BaseTest() {
    @Test
    fun shouldPrintOne() {
        val output = this.run("Constructor.hc")

        Assert.assertEquals("1", output)
    }
}