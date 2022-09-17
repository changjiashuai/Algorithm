import org.junit.jupiter.api.Test

class AddTwoNumbers {

    @Test
    fun test(){
        val l1 = ListNode(2)
        l1.next = ListNode(4)
        l1.next?.next = ListNode(3)

        val l2 = ListNode(5)
        l2.next = ListNode(6)
        l2.next?.next = ListNode(4)

        val l = addTwoNumbers(l1, l2)
        println("l=$l")
    }
}