fun multipleBrackets(str: String): String {
    var leftBracketCount = 0
    var leftSquareBracketCount = 0
    var totalCount = 0

    for (c in str) {
        if (c == '(') {
            leftBracketCount++
        } else if (c == '[') {
            leftSquareBracketCount++
        } else if (c == ')') {
            if (leftBracketCount > 0) {
                leftBracketCount--
                totalCount++
            } else {
                break
            }
        } else if (c == ']') {
            if (leftSquareBracketCount > 0) {
                leftSquareBracketCount--
                totalCount++
            } else {
                break
            }
        }
    }

    val total = leftBracketCount + leftSquareBracketCount
    return if (total != 0) {
        "0"
    } else {
        "1 $totalCount"
    }
}