import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountingMinutesTest {

    @Test
    fun test() {
        assertEquals(60, countingMinutes("9:00am-10:00am"))
        assertEquals(1320, countingMinutes("01:00pm-11:00am"))

        assertEquals(60, countingMinutes("09:00am-10:00am"))
        assertEquals(1320, countingMinutes("1:00pm-11:00am"))
    }
}