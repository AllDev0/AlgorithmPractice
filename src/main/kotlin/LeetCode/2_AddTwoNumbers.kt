package LeetCode

fun main() {
    //Example1
    /*
    val l1: ListNode = ListNode(2)
    l1.next = ListNode(4)
    l1.next!!.next = ListNode(3)

    val l2: ListNode = ListNode(5)
    l2.next = ListNode(6)
    l2.next!!.next = ListNode(4)
     */

    //Example2
    /*
    val l1: ListNode = ListNode(0)

    val l2: ListNode = ListNode(0)
     */

    //Example3
    val l1: ListNode = ListNode(9)
    l1.next = ListNode(9)
    l1.next?.next = ListNode(9)
    l1.next?.next?.next = ListNode(9)
    l1.next?.next?.next?.next = ListNode(9)
    l1.next?.next?.next?.next?.next = ListNode(9)
    l1.next?.next?.next?.next?.next?.next = ListNode(9)

    val l2: ListNode = ListNode(9)
    l2.next = ListNode(9)
    l2.next?.next = ListNode(9)
    l2.next?.next?.next = ListNode(9)


    var result: ListNode? = addTwoNumbers(l1, l2)
    while (result != null){
        print(result.`val`)
        result = result.next
    }

}

class ListNode(var `val`: Int){
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

    var l11 = l1
    var l22 = l2

    val dummyHead = ListNode(0)
    var curr = dummyHead
    var carry = 0

    while (l11 != null || l22 != null || carry != 0){
        val x = l11?.`val` ?: 0
        val y = l22?.`val` ?: 0
        val sum = carry + x + y
        carry = sum / 10
        curr.next = ListNode(sum % 10)
        curr = curr.next!!

        if (l11 != null)
            l11 = l11.next

        if (l22 != null)
            l22 = l22.next
    }

    return dummyHead.next
}