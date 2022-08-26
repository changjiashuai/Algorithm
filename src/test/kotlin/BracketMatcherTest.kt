import org.junit.Assert
import org.junit.Test

class BracketMatcherTest {

    @Test
    fun test() {
        Assert.assertEquals("0", bracketMatcher("(coder)(byte))"))
        Assert.assertEquals("1", bracketMatcher("(c(oder)) b(yte)"))
    }
}