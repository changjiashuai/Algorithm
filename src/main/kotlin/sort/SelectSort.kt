package sort

fun selectSort(arr: Array<Int>): Array<Int> {
    if (arr.isEmpty() || arr.size == 1) {
        return arr
    }
    for (i in arr.indices) {
        var minIndex = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        //swap
        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
    return arr
}