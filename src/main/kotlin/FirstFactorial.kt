fun firstFactorial(num: Int): Long {
    if (num < 1 || num > 18) {
        throw IllegalArgumentException("num must be between 1 and 18")
    }

    var total: Long = 1
    for (i in 1..num) {
        total *= i
    }
    return total
}

fun main() {
    println("total=${firstFactorial(18)}")
}