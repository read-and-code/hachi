package hachi.lang.test

import hachi.lang.exception.ConstructorShouldNotHaveReturnTypeException
import org.junit.Test

class InvalidConstructorTest : BaseTest() {
    @Test(expected = ConstructorShouldNotHaveReturnTypeException::class)
    fun shouldThrowInvalidConstructorException() {
        this.run("InvalidConstructor.hc")
    }
}