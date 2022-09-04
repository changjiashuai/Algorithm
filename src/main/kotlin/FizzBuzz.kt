fun fizzBuzz(n: Int): List<String> {
    val answer = mutableListOf<String>()
    for (i in 1..n) {
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                answer.add("FizzBuzz")
            } else {
                answer.add("Fizz")
            }
        } else if (i % 5 == 0) {
            answer.add("Buzz")
        } else {
            answer.add("$i")
        }
    }
    return answer
}