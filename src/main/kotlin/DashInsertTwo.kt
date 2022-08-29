/**
 * Have the function DashInsertII(str) insert dashes ('-') between each two odd numbers and insert asterisks ('*')
 * between each two even numbers in str. For example: if str is 4546793 the output should be 454*67-9-3.
 * Don't count zero as an odd or even number.
 */
fun dashInsertTwo(str: String): String {
    val sb = StringBuffer()
    var prev = str[0]
    sb.append(prev)
    for (i in 1 until str.length) {

        val next = str[i]

        if (prev.digitToInt() != 0 && next.digitToInt() != 0) {
            if (prev.digitToInt() % 2 == 0 && next.digitToInt() % 2 == 0) {
                sb.append("*")
            }
            if (prev.digitToInt() % 2 != 0 && next.digitToInt() % 2 != 0) {
                sb.append("-")
            }
        }

        sb.append(next)
        prev = next
    }
    return sb.toString()
}