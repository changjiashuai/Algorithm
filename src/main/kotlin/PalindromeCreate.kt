import kotlin.math.max

fun createPalindrome(str: String): String {
    val longestSubStr = longestPalindrome(str)
    println("subStr=$longestSubStr")
    if (longestSubStr.length < 3) {
        return "not possible"
    }
    val sb = StringBuilder()
    str.forEach {
        if (!longestSubStr.contains(it, ignoreCase = false)) {
            sb.append(it)
        }
    }
    println("rs=${sb.toString()}")
    if (sb.toString().length > 2) {
        return "not possible"
    }
    return sb.toString()
}

private fun longestPalindrome(str: String): String {
    if (str.isEmpty()) {
        return ""
    }

    var start = 0
    var end = 0
    for (i in str.indices) {
        val len1 = expandAroundCenter(str, i, i)
        val len2 = expandAroundCenter(str, i, i + 1)
        val len = max(len1, len2)
        if (len > end - start) {
            start = i - (len - 1) / 2
            end = i + len / 2
        }
    }
    return str.substring(start, end + 1)
}

private fun expandAroundCenter(str: String, left: Int, right: Int): Int {
    var l = left
    var r = right
    while (l >= 0 && r < str.length && str[l] == str[r]) {
        --l
        ++r
    }
    return r - l - 1
}


private fun isPalindrome(str: String, low: Int, high: Int): Boolean {
    var i = low
    var j = high
    while (i < j) {
//        println("low=$low, high=$high")
//        println("i=$i, j=$j")
        val c1 = str[i]
        val c2 = str[j]
        if (c1 != c2) {
            return false
        }
        ++i
        --j
    }
    return true
}

private const val NOT_POSSIBLE = "not possible"

fun palindromeCreator(str: String): String {
    if (isPalindrome(str, 0, str.length-1)) {
        return str
    }

    val fromFirst = createPalindrome2(str)
    val fromLast = createPalindrome2(str.reversed())

    println("fromFirst=$fromFirst")
    println("fromLast=$fromLast")

    if (fromFirst != NOT_POSSIBLE && fromLast != NOT_POSSIBLE) {
        if (fromFirst.length > 2 || fromLast.length > 2) {
            return NOT_POSSIBLE
        }
        if (fromFirst.length > fromLast.length) {
            return fromLast
        }
        return fromFirst
    }

    if (fromFirst != fromLast && fromFirst == NOT_POSSIBLE) {
        if (fromLast.length > 2) {
            return NOT_POSSIBLE
        }
        return fromLast
    }

    if (fromLast != fromFirst && fromLast == NOT_POSSIBLE) {
        if (fromFirst.length > 2) {
            return NOT_POSSIBLE
        }
        return fromFirst
    }

    return NOT_POSSIBLE
}

fun createPalindrome2(str: String): String {
    val result = StringBuilder()
    val temp = StringBuilder(str)

    for (i in str.indices) {
        if (str[i] != str[str.length - i - 1]) {
            if (removeCharAndCheck(result, temp)) {
                return result.toString()
            }
        }
    }

    return NOT_POSSIBLE
}

fun removeCharAndCheck(result: StringBuilder, temp: StringBuilder): Boolean {
    result.append(temp[0])
    temp.deleteCharAt(0)
    val length = temp.toString().length
    return isPalindrome(temp.toString(), 0, length-1) && length > 2
}