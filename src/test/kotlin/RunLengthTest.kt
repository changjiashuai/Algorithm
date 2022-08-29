import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RunLengthTest {

    @Test
    fun test() {
        assertEquals("3w2g1o2p", runLength("wwwggopp"))
        assertEquals("1o2p3w2g", runLength("oppwwwgg"))
    }
}