package easy


//https://leetcode.com/problems/merge-two-sorted-lists/
fun main(){

}


fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var auxList1 = list1
    var auxList2 = list2

    var output : ListNode? = null
    var nextValue : ListNode? = null
    while(auxList1 != null && auxList2 != null){
        if(auxList1.`val` > auxList2.`val`){
            nextValue = auxList1
            auxList1 = auxList1.next
        }else{
            nextValue = auxList2
            auxList2 = auxList2.next
        }
        if(output == null) output = nextValue
        else output.next = nextValue
    }
    return output
}

/*
fun push(headNode: ListNode?, newVal: Int):ListNode?{
    val newNode = ListNode(newVal)
    while(headNode?.next != null){
       if(headNode?.next == null)

    }
    newNode.next = headNode
    return newNode
}*/
