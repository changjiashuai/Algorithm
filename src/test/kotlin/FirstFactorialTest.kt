import org.junit.Assert
import org.junit.Test

class FirstFactorialTest {

    @Test(expected = IllegalArgumentException::class)
    fun testIllegalArgumentException() {
        firstFactorial(24)
    }

    @Test
    fun test() {
        Assert.assertEquals(24, firstFactorial(4))
        Assert.assertEquals(40320, firstFactorial(8))
    }
}