import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinWindowTest {

    @Test
    fun test() {
        assertEquals("BANC", minWindow("ADOBECODEBANC", "ABC"))
        assertEquals("a", minWindow("a", "a"))
        assertEquals("", minWindow("a", "aa"))
        assertEquals("affhkkse", minWindow("aaffhkksemckelloe", "fhea"))
        assertEquals("aksfaje", minWindow("ahffaksfajeeubsne", "jefaa"))
    }

    @Test
    fun test2() {
        assertEquals("BANC", minWindow2("ADOBECODEBANC", "ABC"))
        assertEquals("a", minWindow2("a", "a"))
        assertEquals("", minWindow2("a", "aa"))
        assertEquals("aksfaje", minWindow2("ahffaksfajeeubsne", "jefaa"))
        assertEquals("affhkkse", minWindow2("aaffhkksemckelloe", "fhea"))
    }
}