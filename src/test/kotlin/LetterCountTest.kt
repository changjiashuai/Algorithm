import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LetterCountTest {

    @Test
    fun test() {
        assertEquals("greatest", letterCount("Today, is the greatest day ever!"))
        assertEquals("-1", letterCount("a b c d , h e"))
    }
}