package sort

import java.util.Arrays

fun insertSort(arr: Array<Int>): Array<Int> {

    if (arr.isEmpty() || arr.size == 1) {
        return arr
    }

    for (i in 1 until arr.size) {
        for (j in i - 1 downTo 0) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            } else {
                //调出交换查找
                break
            }
        }
    }
    return arr
}