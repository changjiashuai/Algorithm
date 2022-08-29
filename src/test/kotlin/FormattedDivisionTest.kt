import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FormattedDivisionTest {

    @Test
    fun test() {
        assertEquals("12,345.6789", formattedDivision(123456789.0, 10000.0))
        assertEquals("0.6667", formattedDivision(2.0, 3.0))
    }
}