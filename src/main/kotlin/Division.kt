fun division(a: Int, b: Int): Int {

    var tempA = a
    var tempB = b

    while (tempA - tempB != 0) {
        if (tempA > tempB) {
            tempA -= tempB
        } else {
            tempB -= tempA
        }
    }

    return tempA
}