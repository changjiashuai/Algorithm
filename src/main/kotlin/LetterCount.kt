fun letterCount(str: String): String {

    val words = str.split("\\s".toRegex())

    var maxWordCount = 0
    var maxWord = "-1"
    for (word in words) {
        val chars = word.toCharArray()
        chars.sort()
        var prevChar = chars[0]
        var wordCount = 0
        for (i in 1 until chars.size) {
            if (prevChar == chars[i]) {
                wordCount++
            } else {
                wordCount = 1
            }
            if (wordCount > maxWordCount) {
                maxWordCount = wordCount
                maxWord = word
            }
            prevChar = chars[i]
        }
    }

    return maxWord
}