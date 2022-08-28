import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class FirstFactorialTest {

    @Test
    fun testIllegalArgumentException() {
        assertThrows(IllegalArgumentException::class.java) {
            firstFactorial(24)
        }
    }

    @Test
    fun test() {
        assertEquals(24, firstFactorial(4))
        assertEquals(40320, firstFactorial(8))
    }
}