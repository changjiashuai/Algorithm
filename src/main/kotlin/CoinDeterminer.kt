import kotlin.math.min

/**
 * Using the Java language, have the function CoinDeterminer(num) take the input, which will be an integer ranging
 * from 1 to 250, and return an integer output that will specify the least number of coins, that when added,
 * equal the input integer. Coins are based on a system as follows: there are coins representing the integers
 * 1, 5, 7, 9, and 11. So for example: if num is 16, then the output should be 2 because you can achieve the
 * number 16 with the coins 9 and 7. If num is 25, then the output should be 3 because you can achieve 25 with
 * either 11, 9, and 5 coins or with 9, 9, and 7 coins.
 *
 */
fun coinDeterminer(num: Int): Int {
    val coins = arrayOf(1, 5, 7, 9, 11)
    return coinChange(coins, num, IntArray(num) { 0 })
}

/**
 * F(amount) = F(amount - curMinAmount) + 1
 */
private fun coinChange(coins: Array<Int>, amount: Int, count: IntArray): Int {

    if (amount < 0) {
        return -1
    }
    if (amount == 0) {
        return 0
    }
    if (count[amount - 1] != 0) {
        return count[amount - 1]
    }

    var min = Int.MAX_VALUE
    for (coin in coins) {
        val remainAmount = amount - coin
        val curCount = coinChange(coins, remainAmount, count)
        if (curCount in 0 until min) {
            min = curCount + 1
        }
    }
    count[amount - 1] = if (min == Int.MAX_VALUE) -1 else min
    return count[amount - 1]
}

/**
 * F(i) = min[F(i - c[j])]{j=0..n-1} + 1
 */
fun coinChange2(coins: Array<Int>, amount: Int): Int {
    val max = amount + 1
    val dp = IntArray(amount + 1) { max }

    //F(0)=0
    dp[0] = 0
    //F(1),F(2)...F(amount)
    for (curAmount in 1..amount) {
        for (coin in coins) {
            if (coin <= curAmount) {
                dp[curAmount] = min(dp[curAmount], dp[curAmount - coin] + 1)
            }
        }
    }

    return if (dp[amount] == max) -1 else dp[amount]
//    return if (dp[amount] > amount) -1 else dp[amount]

}