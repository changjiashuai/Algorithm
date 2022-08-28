import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BracketMatcherTest {

    @Test
    fun test() {
        Assertions.assertEquals("0", bracketMatcher("(coder)(byte))"))
        Assertions.assertEquals("1", bracketMatcher("(c(oder)) b(yte)"))
    }
}