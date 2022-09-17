/**
 *给你一个整数数组arr，请你删除最小`5%`的数字和最大 `5%`的数字后，剩余数字的平均值。
 *与 标准答案误差在`10-5`的结果都被视为正确结果。
 */
fun trimMean(arr: IntArray): Double {
    //[0~5% ... 95%~1]
    arr.sort()
    val size = arr.size
    //size * 5%
    val start = size / 20
    val end = 19 * size / 20
    var sum = 0
    for (i in start until end) {
        sum += arr[i]
    }
    return sum * 1.0 / (0.9 * size)
}