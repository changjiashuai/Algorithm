package coins

fun coinWays(array: Array<Int>, index: Int, rest: Int): Int {

    if (index == array.size) {
        return if (rest == 0) 1 else 0
    }

    var ways = 0
    var count = 0
    while (count * array[index] <= rest) {
        ways += coinWays(array, index + 1, rest - array[index] * count)
        count++
    }
    return ways
}

fun coinWaysDp(array: Array<Int>, aim: Int): Int {
    if (array.isEmpty()) {
        return 0
    }

    val n = array.size
    val dp = Array(size = n + 1) {
        Array(aim + 1) {
            0
        }
    }

    dp[n][0] = 1

    for (index in n - 1 downTo 0) {
        for (rest in 0..aim) {
            var count = 0
            while (count * array[index] <= rest) {
                dp[index][rest] += dp[index + 1][rest - array[index] * count]
                count++
            }
        }
    }

    return dp[0][aim]
}

fun coinWaysDp2(array: Array<Int>, aim: Int): Int {
    if (array.isEmpty()) {
        return 0
    }

    val n = array.size
    val dp = Array(size = n + 1) {
        Array(aim + 1) {
            0
        }
    }

    dp[n][0] = 1

    for (index in n - 1 downTo 0) {
        for (rest in 0..aim) {
            dp[index][rest] += dp[index + 1][rest]
            if (rest - array[index] >= 0) {
                dp[index][rest] += dp[index][rest - array[index]]
            }
        }
    }

    return dp[0][aim]
}