fun bracketMatcher(str: String): String {

    var leftCount = 0
    var rightCount = 0

    str.filter { c ->
        if (c == '(') {
            leftCount += 1
        } else if (c == ')') {
            rightCount += 1
        }
        return@filter true
    }
    return if (leftCount == rightCount) "1" else "0"
}