import org.junit.Assert
import org.junit.Test

class FirstReverseTest {

    @Test
    fun test1() {
        Assert.assertEquals("etybredoc", firstReverse("coderbyte"))
        Assert.assertEquals("edoC evoL I", firstReverse("I Love Code"))
    }

    @Test
    fun test2() {
        Assert.assertEquals("etybredoc", firstReverse2("coderbyte"))
        Assert.assertEquals("edoC evoL I", firstReverse2("I Love Code"))
    }
}