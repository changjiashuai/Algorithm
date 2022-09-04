fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = Int.MIN_VALUE
    for (account in accounts) {
        var total = 0
        for (count in account) {
            total += count
        }
        if (total > max) {
            max = total
        }
    }
    return max
}