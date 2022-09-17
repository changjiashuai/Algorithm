/**
 * 给你一个非负整数数组 nums。如果存在一个数 x，使得nums中恰好有 x 个元素 大于或者等于 x，
 * 那么就称 nums 是一个 特殊数组 ，而 x 是该数组的 特征值 。
 * 注意： x 不必 是 nums 的中的元素。
 * 如果数组 nums 是一个 特殊数组 ，请返回它的特征值 x 。否则，返回 -1 。可以证明的是，如果 nums 是特殊数组，那么其特征值 x 是 唯一的 。
 */
fun specialArray(nums: IntArray): Int {
    //x  nums[i..j] >=x
    //j-x +1= x
    val size = nums.size
    for (i in 1..size) {
        var count = 0
        for (num in nums) {
            if (num >= i) {
                count++
            }
        }
        if (count == i) {
            return i
        }

    }
    return -1
}


fun specialArray2(nums: IntArray): Int {
    //x  nums[i..j] >=x
    //j-x +1= x
    nums.sort()
    val size = nums.size
    if (size == 0){
        return -1
    }
    if (nums[0] >= size) {
        return size
    }
    for (i in 1 until size) {
        if (nums[i] >= size-i && nums[i - 1] < size - i) {
            return size-i
        }
    }
    return -1
}