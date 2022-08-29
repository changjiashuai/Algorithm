import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SimpleModeTest {

    @Test
    fun test() {
        assertEquals(4, simpleMode(arrayOf(10, 4, 5, 2, 4)))
        assertEquals(5, simpleMode(arrayOf(5, 10, 10, 6, 5)))
        assertEquals(-1, simpleMode(arrayOf(5, 1, 0, 6, 15)))
    }
}