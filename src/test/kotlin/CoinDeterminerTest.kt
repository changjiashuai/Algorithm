import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CoinDeterminerTest {

    @Test
    fun test() {
        assertEquals(2, coinDeterminer(16))
        assertEquals(3, coinDeterminer(25))
    }

    @Test
    fun test2() {
        assertEquals(2, coinChange2(arrayOf(1, 5, 7, 9, 11), 16))
        assertEquals(3, coinChange2(arrayOf(1, 5, 7, 9, 11), 25))
    }
}