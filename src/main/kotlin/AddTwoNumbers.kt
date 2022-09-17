import java.lang.StringBuilder

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1?.`val` == 0 && l1?.next == null) {
        return l2
    }
    if (l2?.`val` == 0 && l2?.next == null) {
        return l1
    }

    val s1 = StringBuilder()
    s1.append(l1!!.`val`)
    var h1 = l1
    while (h1?.next != null) {
        s1.append(h1.next!!.`val`)
        h1 = h1.next
    }

    val s2 = StringBuilder()
    s2.append(l2!!.`val`)
    var h2 = l2
    while (h2?.next != null) {
        s2.append(h2.next!!.`val`)
        h2 = h2.next
    }

    val sum = s1.toString().reversed().toBigDecimal() + s2.toString().reversed().toBigDecimal()
    val chars = "$sum".reversed().toCharArray()

    var head: ListNode? = null
    var tail: ListNode? = null
    var i = 0
    do {
        val c = chars[i]
        if (head == null) {
            head = ListNode("$c".toInt())
            tail = head
        } else {
            tail?.next = ListNode("$c".toInt())
            tail = tail?.next
        }
        i++
    } while (i < chars.size)

    return head
}

fun addTwoNumbers2(l1: ListNode?, l2: ListNode?): ListNode? {

    var head: ListNode? = null
    var tail: ListNode? = null
    var newL1 = l1
    var newL2 = l2
    var carry = 0
    while (newL1 != null || newL2 != null) {
        val n1 = newL1?.`val` ?: 0
        val n2 = newL2?.`val` ?: 0
        val sum = (n1 + n2 + carry) % 10
        carry = (n1 + n2 + carry) / 10
        if (head == null) {
            head = ListNode(sum)
            tail = head
        } else {
            tail?.next = ListNode(sum)
            tail = tail?.next
        }
        newL1 = newL1?.next
        newL2 = newL2?.next
    }
    if (carry > 0) {
        tail?.next = ListNode(carry)
    }
    return head
}