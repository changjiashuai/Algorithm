/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * 如果可以，返回 true ；否则返回 false 。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/ransom-note
 */
fun canConstruct(ransomNote: String, magazine: String): Boolean {

    var temp: String = magazine
    for (c in ransomNote) {
        if (temp.contains(c)) {
            val index = temp.indexOf(c)
            temp = temp.removeRange(index, index + 1)
        } else {
            return false
        }
    }
    return true
}

fun canConstruct2(ransomNote: String, magazine: String): Boolean {

    if (ransomNote.length > magazine.length) {
        return false
    }
    val counts = Array<Int>(26) { 0 }
    for (c in magazine) {
        counts[c - 'a']++
    }
    for (c in ransomNote) {
        counts[c - 'a']--
        if (counts[c - 'a'] < 0) {
            return false
        }
    }
    return true
}