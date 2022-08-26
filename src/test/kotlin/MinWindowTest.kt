import org.junit.Assert
import org.junit.Test

class MinWindowTest {

    @Test
    fun test() {
        Assert.assertEquals("BANC", minWindow("ADOBECODEBANC", "ABC"))
        Assert.assertEquals("a", minWindow("a", "a"))
        Assert.assertEquals("", minWindow("a", "aa"))
    }

    @Test
    fun test2() {
        Assert.assertEquals("BANC", minWindow2("ADOBECODEBANC", "ABC"))
        Assert.assertEquals("a", minWindow2("a", "a"))
        Assert.assertEquals("", minWindow2("a", "aa"))
    }
}