import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {

    if (num == 1) {
        return false
    }

    if (num == 2) {
        return true
    }

    if (num % 2 == 0) {
        return false
    }

    val upper = sqrt(num.toDouble()) + 1
    for (i in 3 until upper.toInt() step 2) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}

fun isPrime2(num: Int): Boolean {
    if (num == 1) {
        return false
    }

    if (num == 2) {
        return true
    }

    if (num % 2 == 0) {
        return false
    }

    var sum = 0
    num.toString().toCharArray().forEach {
        sum += it.digitToInt()
    }
    if (sum / 3 == 0) {
        return false
    }
    return true
}