import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MultipleBracketsTest {

    @Test
    fun test() {
        assertEquals("1 3", multipleBrackets("(hello [world])(!)"))
        assertEquals("0", multipleBrackets("((hello [world])"))
    }
}