import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GetHintTest {

    @Test
    fun test(){
        assertEquals("0A1B", getHint2("1122", "0001"))
    }
}