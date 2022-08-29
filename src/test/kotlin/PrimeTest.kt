import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PrimeTest {

    @Test
    fun testIsPrime() {
        assertTrue { isPrime(7) }
        assertTrue { isPrime2(7) }

        assertFalse { isPrime(16) }
        assertFalse { isPrime2(16) }

        assertTrue { isPrime(1999) }
        assertTrue { isPrime2(1999) }

        assertFalse { isPrime(1001) }
        assertFalse { isPrime2(1001) }
    }
}