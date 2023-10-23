package easy

//https://leetcode.com/problems/plus-one/

/**
 *
 * me dan una lista [8,2,4,9,6,1]
 * 8 1 81 -> 81
 * 2 6 -> 26
 * concatenar primer y ultimo valor y agregarlo al result
 * hacer lo mismo con todos los valores y mostrar la suma final
 *
 *
 */

fun main() {
    val input = ListNode(1)
    input.next = ListNode(2)
    input.next?.next = ListNode(3)
    input.next?.next?.next = ListNode(4)
    input.next?.next?.next?.next = ListNode(5)
    input.next?.next?.next?.next?.next = ListNode(6)

    //[1,2,3,4,5,6]

    println(input.`val`)
    println(input.next?.`val`)
    var aux : ListNode? = input

    aux?.next = input.next?.next

    while(aux != null){
        print(aux.`val`)
        aux = aux.next
    }
}

class ListNode(var `val`: Int){
    var next: ListNode? = null
}


fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head

    var slow: ListNode? = dummy
    var fast: ListNode? = dummy

    // Move the fast pointer n steps ahead
    for (i in 0..n) {
        fast = fast?.next
    }

    // Move both pointers until the fast pointer reaches the end
    while (fast != null) {
        slow = slow?.next
        fast = fast.next
    }

    // Remove the Nth node
    slow?.next = slow?.next?.next

    return dummy.next
}













fun myFunction() {
    print("Hola mundo")
}

//input: [1,2,3]
//100
//10
//1
/*fun plusOne(digits: IntArray): IntArray {
    val newDigit = if(digits.lastIndex != 9) digits.lastIndex
    return list
}*/