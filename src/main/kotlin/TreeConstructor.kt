fun treeConstructor(strArr: Array<String>): Boolean {

    val childs = mutableListOf<String>()
    val parentCount = mutableMapOf<String, Int>()

    for (s in strArr) {
        val pair = s.replace("(", "").replace(")", "").split(",")
        val child = pair[0]
        val parent = pair[1]

        childs.add(child)

        val pCount = parentCount[parent] ?: 0
        if (pCount > 1) {
            return false
        } else {
            parentCount[parent] = pCount + 1
        }
    }
    return childs.size == strArr.size
}