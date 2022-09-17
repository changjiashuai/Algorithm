fun maximumSwap(num: Int): Int {

    val chars = num.toString(10).toCharArray()
    val size = chars.size
    var max = num
    for (i in 0 until size) {
        for (j in 1 until size) {
            swap(chars, i, j)
            max = Math.max(max, String(chars).toInt())
            swap(chars, i, j)
        }
    }
    return max
}


fun maximumSwap2(num: Int): Int {

    if (num < 10) {
        return num
    }

    val chars = num.toString(10).toCharArray()
    val size = chars.size

    for (i in 0 until size) {
        var maxIndex = i
        var j = size - 1
        while (j >= i + 1) {
            if (chars[j] > chars[maxIndex]) {
                maxIndex = j
            }
            j--
        }
        if (maxIndex != i) {
            swap(chars, i, maxIndex)
            return String(chars).toInt()
        }
    }
    return num
}

private fun swap(charArray: CharArray, i: Int, j: Int) {
    val temp = charArray[i]
    charArray[i] = charArray[j]
    charArray[j] = temp
}