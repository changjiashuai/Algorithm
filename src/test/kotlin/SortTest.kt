import org.junit.jupiter.api.Test
import sort.bubbleSort
import sort.insertSort
import sort.selectSort
import kotlin.test.assertContentEquals

class SortTest {

    private val array = arrayOf(3, 5, 2, 7, 9, 10, 4, 2)
    private val sortedArray = arrayOf(2, 2, 3, 4, 5, 7, 9, 10)

    @Test
    fun testSelectSort() {
        assertContentEquals(sortedArray, selectSort(array))
    }

    @Test
    fun testBubbleSort() {
        assertContentEquals(sortedArray, bubbleSort(array))
    }

    @Test
    fun testInsertSort() {
        assertContentEquals(sortedArray, insertSort(array))
    }
}