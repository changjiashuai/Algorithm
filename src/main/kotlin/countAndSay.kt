fun countAndSay(n: Int): String {
    if (n == 1) {
        return "1"
    }
    return getValue(countAndSay(n - 1))
}

fun getValue(str: String): String {

    val chars = str.toCharArray()
    val sb = StringBuilder()
    var count = 1
    var i = 0
    do {
        if (i + 1 < chars.size && chars[i] == chars[i + 1]) {
            count++
        } else {
            sb.append(count).append(chars[i])
            count = 1
        }
        i++
    } while (i < chars.size)

    return sb.toString()
}