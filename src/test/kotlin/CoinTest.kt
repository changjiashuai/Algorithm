import coins.coinWays
import coins.coinWaysDp
import coins.coinWaysDp2
import org.junit.jupiter.api.Test

class CoinTest {

    @Test
    fun test() {
        val startTime = System.currentTimeMillis()
        val count = coinWays(arrayOf(3, 5, 6, 7, 9, 2, 1), 0, 310)
        println("count=$count, dx=${System.currentTimeMillis() - startTime}")

        val st = System.currentTimeMillis()
        val count2 = coinWaysDp(arrayOf(3, 5, 6, 7, 9, 2, 1), 310)
        println("count2=$count2, dx2=${System.currentTimeMillis() - st}")

        val st2 = System.currentTimeMillis()
        val count3 = coinWaysDp2(arrayOf(3, 5, 6, 7, 9, 2, 1), 310)
        println("count3=$count3, dx3=${System.currentTimeMillis() - st2}")
    }
}