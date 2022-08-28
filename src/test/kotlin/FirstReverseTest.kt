import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstReverseTest {

    @Test
    fun test1() {
        assertEquals("etybredoc", firstReverse("coderbyte"))
        assertEquals("edoC evoL I", firstReverse("I Love Code"))
    }

    @Test
    fun test2() {
        assertEquals("etybredoc", firstReverse2("coderbyte"))
        assertEquals("edoC evoL I", firstReverse2("I Love Code"))
    }
}