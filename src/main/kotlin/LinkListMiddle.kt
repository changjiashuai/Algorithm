/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun middleNode(head: ListNode?): ListNode? {
    val list = mutableListOf<ListNode?>()
    var newHead = head
    list.add(newHead)
    while (newHead?.next != null) {
        list.add(newHead.next)
        newHead = newHead.next
    }
    return if (list.size > 0) {
        val middle = list.size / 2
        list[middle]
    } else {
        null
    }
}

fun middleNode2(head: ListNode?): ListNode? {
    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }
    return slow
}