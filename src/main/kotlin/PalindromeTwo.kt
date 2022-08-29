import java.util.*

fun palindromeTwo(str: String): Boolean {
    val newStr = removePunctuationOrSymbols(str)

    val length = newStr.length
    for (i in 0 until length / 2) {
        if (newStr[i] != newStr[length - 1 - i]) {
            return false
        }
    }
    return true
}

fun removePunctuationOrSymbols(str: String): String {
    return str.toLowerCase(Locale.getDefault()).replace("[^a-z$]".toRegex(), "")
}