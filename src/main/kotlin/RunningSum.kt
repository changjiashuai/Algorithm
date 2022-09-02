fun runningSum(nums: IntArray): IntArray {
    val list = mutableListOf<Int>()
    var preSum = 0
    for (i in 1 until nums.size) {
//        preSum += nums[i]
//        list.add(preSum)
        nums[i] += nums[i-1]
    }
    return nums
//    return list.toIntArray()
}