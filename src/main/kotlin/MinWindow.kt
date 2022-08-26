fun minWindow(s: String, t: String): String {

    val tMap = mutableMapOf<Char, Int>()
    for (element in t) {
        if (!tMap.containsKey(element)) {
            tMap[element] = 1
        } else {
            tMap[element] = tMap[element]!! + 1
        }
    }

    var l = 0
    var minStart = 0
    var minWinSize = s.length + 1
    var count = 0

    for (i in s.indices) {
        val c = s[i]
        if (tMap.containsKey(c)) {
            if (tMap.getOrDefault(c, 0) > 0) {
                count++
            }
            //???
//            tMap[c] = tMap[c]!! - 1
            println("tMap[$c] = ${tMap[c]}")
        }

        println("c=$c, count=$count, l=$l")

        while (count == t.length) {

            if (i - l + 1 < minWinSize) {
                minWinSize = i - l + 1
                minStart = l
            }

            val leftChar = s[l]
            if (tMap.containsKey(leftChar)) {
                tMap[leftChar] = tMap[leftChar]!! + 1
                if (tMap[leftChar]!! > 0) {
                    count--
                }
            }
            l++
        }
    }

    if (minWinSize == s.length + 1) {
        return ""
    }

    return s.substring(minStart, minWinSize + minStart)
}

fun minWindow2(s: String, t: String): String {

    if (s.isEmpty() || t.isEmpty()) {
        return ""
    }

    //target
    val dictT = mutableMapOf<Char, Int>()
    for (c in t) {
        val count = dictT.getOrDefault(c, 0)
        dictT[c] = count + 1
    }

    var l = 0
    var r = 0
    //windowLength, l, r
    val ans = arrayOf(-1, 0, 0)

    val targetCount = dictT.size
    //???
    var currentCount = 0

    val windowContents = mutableMapOf<Char, Int>()

    //find all target substring right move ++
    while (r < s.length) {
        val c = s[r]
        val count = windowContents.getOrDefault(c, 0)
        windowContents[c] = count + 1

        //
        if (dictT.containsKey(c) && windowContents[c] == dictT[c]) {
            currentCount++
        }

        //match target substring start left move
        while (l <= r && currentCount == targetCount) {
            val c = s[l]

            if (ans[0] == -1 || r - l + 1 < ans[0]) {
                ans[0] = r - l + 1
                ans[1] = l
                ans[2] = r
            }

            //left move --
            windowContents[c] = windowContents[c]!! - 1
            if (dictT.containsKey(c) && windowContents[c]!! < dictT[c]!!) {
                currentCount--
            }

            l++
        }
        r++
    }

    return if (ans[0] == -1) "" else s.substring(ans[1], ans[2] + 1)
}