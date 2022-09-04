import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CanConstructTest {

    @Test
    fun test() {
        assertTrue {
            canConstruct("aa", "aab")
        }
        assertFalse {
            canConstruct("a", "b")
        }
        assertFalse {
            canConstruct("aa", "ab")
        }
        assertFalse {
            canConstruct(
                "fihjjjjei",
                "hjibagacbhadfaefdjaeaebgi"
            )
        }
    }

    @Test
    fun test2() {
        assertTrue {
            canConstruct2("aa", "aab")
        }
        assertFalse {
            canConstruct2("a", "b")
        }
        assertFalse {
            canConstruct2("aa", "ab")
        }
        assertFalse {
            canConstruct2(
                "fihjjjjei",
                "hjibagacbhadfaefdjaeaebgi"
            )
        }
    }
}