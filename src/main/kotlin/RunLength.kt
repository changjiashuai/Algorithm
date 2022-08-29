fun runLength(str: String): String {

    val map = mutableMapOf<Char, Int>()
    for (c in str) {
        if (map.containsKey(c)) {
            map[c] = map[c]!! + 1
        } else {
            map[c] = 1
        }
    }

    val sb = StringBuffer()
    for ((key, value) in map) {
        sb.append(value).append(key)
    }

    return sb.toString()
}