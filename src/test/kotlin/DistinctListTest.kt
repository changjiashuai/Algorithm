import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DistinctListTest {

    @Test
    fun test() {
        assertEquals(2, distinctList(arrayOf(1, 2, 2, 2, 3)))
        assertEquals(2, distinctList2(arrayOf(1, 2, 2, 2, 3)))

        assertEquals(3, distinctList(arrayOf(0, -1, -1, 2, 5, 2, 3, 5)))
        assertEquals(3, distinctList2(arrayOf(0, -1, -1, 2, 5, 2, 3, 5)))
    }
}