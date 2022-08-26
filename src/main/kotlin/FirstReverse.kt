fun firstReverse(str: String): String {
    val chars = str.toCharArray()
    val sb = StringBuffer()
    for (i in chars.size - 1 downTo 0) {
        sb.append(chars[i])
    }
    return sb.toString()
}

fun firstReverse2(str: String): String {
    val chars = str.toCharArray()
    var start = 0
    var end = chars.size - 1
    while (start < end) {
        val c = chars[start]
        chars[start] = chars[end]
        chars[end] = c
        start++
        end--
    }
    return String(chars)
}