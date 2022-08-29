fun primeMover(numth: Int): Int {

    var i = 1
    var count = 1
    while (count <= numth) {
        if (isPrime(i)) {
            count++
        }
        i++
    }
    return i - 1
}