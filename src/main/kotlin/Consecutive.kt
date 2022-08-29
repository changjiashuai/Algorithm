import kotlin.math.abs

fun consecutive(arr: Array<Int>): Int {
    arr.sort()
    var amount = 0
    for (i in 1 until arr.size) {
        amount += abs(arr[i] - arr[i - 1]) - 1
    }
    return amount
}