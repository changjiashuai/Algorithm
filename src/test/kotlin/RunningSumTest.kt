import kotlin.test.Test
import kotlin.test.assertEquals

class RunningSumTest {

    @Test
    fun test() {
        assertEquals("[1, 2, 3, 4, 5]", runningSum(intArrayOf(1, 1, 1, 1, 1)).contentToString())
        assertEquals("[3, 4, 6, 16, 17]", runningSum(intArrayOf(3, 1, 2, 10, 1)).contentToString())
    }
}