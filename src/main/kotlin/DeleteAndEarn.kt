fun deleteAndEarn(nums: IntArray): Int {

    var max = 0
    for (num in nums) {
        max = Math.max(num, max)
    }

    val sumArr = Array(max + 1) { 0 }
    for (num in nums) {
        sumArr[num] += num
    }

    val n = sumArr.size
    val dp = Array(n + 1) { 0 }
    dp[0] = 0
    dp[1] = sumArr[1]
    for (i in 2..n) {
        dp[i] = Math.max(dp[i - 1], sumArr[i - 1] + dp[i - 2])
    }
    return dp[n]
}


fun deleteAndEarn2(nums: IntArray): Int {

    var max = 0
    for (num in nums) {
        max = Math.max(num, max)
    }

    val sumArr = Array(max + 1) { 0 }
    for (num in nums) {
        sumArr[num] += num
    }

    var prev = 0
    var cur = 0
    for (sum in sumArr) {
        val temp = Math.max(cur, prev + sum)
        prev = cur
        cur = temp
    }
    return cur
}

fun deleteAndEarn3(nums: IntArray): Int {

    val cnts = Array(10001) { 0 }
    var max = 0
    for (num in nums) {
        cnts[num]++
        max = Math.max(num, max)
    }

    val sumArr = Array(max + 1) { Array(2) { 0 } }

    for (i in 1..max) {
        sumArr[i][0] = Math.max(sumArr[i - 1][1], sumArr[i - 1][0])
        sumArr[i][1] = i * cnts[i] + sumArr[i - 1][0]
    }
    return Math.max(sumArr[max][0], sumArr[max][1])
}