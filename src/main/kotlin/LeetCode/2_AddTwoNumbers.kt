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

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var listNode1 = l1
    var listNode2 = l2
    var n1 = ""
    var n2 = ""
    var result: ListNode? = null
    var current: ListNode? = null

    // Convert linked list 1 to string n1
    while (listNode1 != null) {
        n1 += listNode1.`val`.toString()
        listNode1 = listNode1.next
    }

    // Convert linked list 2 to string n2
    while (listNode2 != null) {
        n2 += listNode2.`val`.toString()
        listNode2 = listNode2.next
    }

    // Calculate the sum of n1 and n2 as a string
    val sum = (n1.toInt() + n2.toInt()).toString()

    // Build the result linked list
    for (char in sum.reversed()) {
        val digit = char.toString().toInt()
        if (result == null) {
            result = ListNode(digit)
            current = result
        } else {
            current?.next = ListNode(digit)
            current = current?.next
        }
    }

    return result
}