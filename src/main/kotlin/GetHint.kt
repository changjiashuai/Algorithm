fun getHint(secret: String, guess: String): String {

    val sMap = hashMapOf<Int, Char>()
    val sChars = secret.toCharArray()
    for (i in sChars.indices) {
        sMap[i] = sChars[i]
    }

    val gMap = hashMapOf<Int, Char>()
    val gChars = guess.toCharArray()
    for (i in gChars.indices) {
        gMap[i] = gChars[i]
    }

    //A
    var countA = 0
    val bValues = mutableListOf<Char>()
    for ((key, value) in sMap.entries) {
        if (gMap[key] == value) {
            countA++
            gMap.remove(key)
        } else {
            bValues.add(value)
        }
    }

    //B
    var countB = 0
    for (c in bValues) {
        if (gMap.values.contains(c)) {
            countB++
            gMap.values.remove(c)
        }
    }

    return "${countA}A${countB}B"
}


fun getHint2(secret: String, guess: String): String {

    val sChars = secret.toCharArray()
    val gChars = guess.toCharArray()

    //A
    var countA = 0

    //B
    var countB = 0
    val sbValueCount = Array(10) { 0 }
    val gbValueCount = Array(10) { 0 }

    for (i in sChars.indices) {
        if (sChars[i] == gChars[i]) {
            countA++
        } else {
            sbValueCount[sChars[i] - '0']++
            gbValueCount[gChars[i] - '0']++
        }
    }

    for (i in 0 until 10){
        countB += Math.min(sbValueCount[i], gbValueCount[i])
    }

    return "${countA}A${countB}B"
}