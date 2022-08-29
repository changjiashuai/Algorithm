/**
 * Have the function SimpleMode(arr) take the array of numbers stored in arr and return the number that appears
 * most frequently (the mode). For example: if arr contains [10, 4, 5, 2, 4] the output should be 4.
 * If there is more than one mode return the one that appeared in the array first (ie. [5, 10, 10, 6, 5]
 * should return 5 because it appeared first). If there is no mode return -1. The array will not be empty.
 *
 */
fun simpleMode(arr: Array<Int>): Int {
    var maxCount = 0
    var numCount = 0

    var num = -1

    for (i in arr.indices) {

        for (j in arr.indices) {
            if (j == i || arr[i] == arr[j]) {
                numCount++
            }
        }

        if (numCount > maxCount) {
            maxCount = numCount
            num = arr[i]
        }

        numCount = 0
    }
    return if (maxCount > 1) num else -1
}