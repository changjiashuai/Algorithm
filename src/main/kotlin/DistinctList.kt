/**
 * Have the function DistinctList(arr) take the array of numbers stored in arr and determine the total number of
 * duplicate entries. For example if the input is [1, 2, 2, 2, 3] then your program should output 2 because there are
 * two duplicates of one of the elements.
 */
fun distinctList(arr: Array<Int>): Int {

    arr.sort()

    var count = 0
    for (i in 0 until arr.size - 1) {
        if (arr[i] == arr[i + 1]) {
            count++
        }
    }

    return count
}

fun distinctList2(arr: Array<Int>): Int {

    val map = mutableMapOf<Int, Int>()
    var count = 0
    for (i in arr.indices) {
        val key = arr[i]
        if (map.containsKey(key)) {
            map[key] = map[key]!! + 1
        } else {
            map[key] = 0
        }
    }

    for ((_, value) in map) {
        count += value
    }

    return count
}