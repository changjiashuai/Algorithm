/**
 * Have the function PermutationStep(num) take the num parameter being passed and return the next number greater than
 * num using the same digits. For example: if num is 123 return 132, if it's 12453 return 12534.
 * If a number has no greater permutations, return -1 (ie. 999).
 *
 */
fun permutationStep(num: Int): Int {
    val perms = getPermutations("", "$num", ArrayList())
    perms.sort()

    val startIndex = perms.indexOf(num)
    if (startIndex == perms.size - 1) {
        return -1
    }

    for (i in startIndex until perms.size) {
        if (perms[i] != num) {
            return perms[i]
        }
    }
    return -1
}

private fun getPermutations(beginStr: String, endStr: String, perms: ArrayList<Int>): ArrayList<Int> {
    if (endStr.length <= 1) {
        perms.add(Integer.parseInt(beginStr + endStr))
    } else {
        for (i in endStr.indices) {
            val newBeginStr = beginStr + endStr[i]
            //remove char of index position
            val newEndStr = endStr.substring(0, i) + endStr.substring(i + 1)
            getPermutations(newBeginStr, newEndStr, perms)
        }
    }
    return perms
}