/**
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。
 * 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 */
fun numberOfSteps(num: Int): Int {
    var result = num
    var count = 0
    while (result != 0) {
        if (result % 2 == 0) {
            result /= 2
        } else {
            result -= 1
        }
        count += 1
    }
    return count
}