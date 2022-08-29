import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LookSaySequenceTest {

    @Test
    fun test(){
        assertEquals("11", lookSaySequence(1))
        assertEquals("21", lookSaySequence(11))
        assertEquals("1211", lookSaySequence(21))
        assertEquals("111221", lookSaySequence(1211))
        assertEquals("312211", lookSaySequence(111221))
    }
}