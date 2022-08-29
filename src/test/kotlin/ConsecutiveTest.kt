import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConsecutiveTest {

    @Test
    fun test() {
        assertEquals(2, consecutive(arrayOf(4, 8, 6)))
        assertEquals(10, consecutive(arrayOf(-2, 10, 4)))
    }
}