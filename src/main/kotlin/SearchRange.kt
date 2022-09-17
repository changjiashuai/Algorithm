fun searchRange(nums: IntArray, target: Int): IntArray {
    var l = 0
    var r = nums.size - 1
    val indexArr = IntArray(2) { -1 }
    while (l <= r) {
        if (nums[l] == target) {
            if (indexArr[0] == -1) {
                indexArr[0] = l
            } else {
                break
            }
        }
        l++
    }
    while (r >= 0) {
        if (nums[r] == target) {
            if (indexArr[1] == -1) {
                indexArr[1] = r
            } else {
                break
            }
        }
        r--
    }
    return indexArr
}