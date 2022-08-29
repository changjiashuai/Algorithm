/**
 * Have the function LookSaySequence(num) take the num parameter being passed and return the next number in the sequence
 * according to the following rule: to generate the next number in a sequence read off the digits of the given number,
 * counting the number of digits in groups of the same digit.
 * For example, the sequence beginning with 1 would be: 1, 11, 21, 1211, ... The 11 comes from there being "one 1"
 * before it and the 21 comes from there being "two 1's" before it. So your program should return the next number
 * in the sequence given num.
 *
 */
fun lookSaySequence(num: Int): String {
    if (num < 10) {
        return "1$num"
    }
    val result = StringBuilder()
    var charCount = 1
    val numChars = "$num".toCharArray()
    var prevChar = numChars[0]

    for (i in 1 until numChars.size) {
        if (prevChar == numChars[i]) {
            charCount++
        } else {
            result.append(charCount).append(prevChar)
            charCount = 1
            prevChar = numChars[i]
        }

        if (i == numChars.size - 1) {
            result.append(charCount).append(prevChar)
        }
    }

    return result.toString()
}