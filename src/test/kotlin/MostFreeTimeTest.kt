import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MostFreeTimeTest {

    @Test
    fun test(){
        assertEquals("09:10AM 02:45PM", mostFreeTime(arrayOf("10:00AM-12:30PM","02:00PM-02:45PM","09:10AM-09:50AM")))
        assertEquals("09:00AM 02:00PM", mostFreeTime(arrayOf("12:15PM-02:00PM","09:00AM-10:00AM","10:30AM-12:00PM")))
    }
}