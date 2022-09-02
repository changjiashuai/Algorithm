import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PalindromeCreateTest {

    @Test
    fun test() {
//        assertEquals("not possible", createPalindrome("mkop"))
//        assertEquals("not possible", createPalindrome("pakop"))
//        assertEquals("k", createPalindrome("kjjjhjjj"))
//

        assertEquals("not possible", palindromeCreator("mkop"))
        assertEquals("not possible", palindromeCreator("pmkop"))
        assertEquals("k", palindromeCreator("kjjjhjjj"))
    }
}