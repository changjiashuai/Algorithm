import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DashInsertTwoTest {

    @Test
    fun test() {
        assertEquals("454*67-9-3", dashInsertTwo("4546793"))
        assertEquals("87-9-3-74*672*8*6", dashInsertTwo("87937467286"))
        assertEquals("80709-3074*672*8*6", dashInsertTwo("80709307467286"))
    }
}