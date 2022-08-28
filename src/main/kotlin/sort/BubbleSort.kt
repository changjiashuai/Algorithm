package sort

fun bubbleSort(arr: Array<Int>): Array<Int> {

    if (arr.isEmpty() || arr.size == 1) {
        return arr
    }

    for (i in arr.indices) {
        for (j in 0 until arr.size - 1 - i) {
            if (arr[j + 1] < arr[j]) {
                //swap
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}