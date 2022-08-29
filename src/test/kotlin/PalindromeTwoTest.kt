import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeTwoTest {

    @Test
    fun test() {
        val a = "Noel - sees Leon"
        val b = "Anne, I vote more cars race Rome-to-Vienna"
        val c = "A man, a plan, a canal – Panama."

        println(removePunctuationOrSymbols(a))
        println(removePunctuationOrSymbols(b))
        println(removePunctuationOrSymbols(c))

        assertTrue { palindromeTwo(a) }
        assertTrue { palindromeTwo(b) }
        assertTrue { palindromeTwo(c) }
    }
}