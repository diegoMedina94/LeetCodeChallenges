package medium

import easy.ListNode

//https://leetcode.com/problems/add-two-numbers/

//fun main(){
//    val input1 = ListNode(2)
//    input1.next = ListNode(4)
//    input1.next?.next = ListNode(9)
//
//    val input2 = ListNode(5)
//    input2.next = ListNode(6)
//    input2.next?.next = ListNode(4)
//    input2.next?.next?.next = ListNode(9)
//
//    addTwoNumbers(input1,input2)
//}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var l1Aux = l1
    var num1 = ""
    while(l1Aux != null){
        num1 = l1Aux.`val`.toString() + num1
        l1Aux = l1Aux.next
    }

    var l2Aux = l2
    var num2 = ""
    while(l2Aux != null){
        num2 = l2Aux.`val`.toString() + num2
        l2Aux = l2Aux.next
    }
    val result = (num1.toInt() + num2.toInt()).toString()
    var output : ListNode? = null
    result.forEach {
        val tempNode = ListNode(it.toString().toInt())
        if(output == null) output = tempNode
        else {
            tempNode.next = output
            output = tempNode
        }
    }
    return output
}


//Format path URL
//Given a path url in the following format: abc-d-efg-41443/hij-k-lmn-opq-41451 return only the numbers by each path connected by underscore, for example: 41443_41451
//There might be 3 paths at most with valid ids, means you can build a result as follow: 12345_67890_12345.
//Numbers contains 5 digits at most.

/*fun main() {
    var auxNum = 38
    while(auxNum > 10){
        val stringNum = auxNum.toString()
        var tempSum = 0
        stringNum.forEach {
            tempSum += it.toString().toInt()
        }
        auxNum = tempSum
    }
    println(auxNum)
    //print(formatPathUrl("abc-d-efg-41443/hij-k-lmn-opq-41451"))
}*/

fun formatPathUrl(pathUrl: String): String {
    val paths = pathUrl.split('/')
    val format = StringBuilder()
    paths.forEach { path ->
        format.append("${path.filter { it.isDigit()}}_")
    }
    return format.toString().dropLast(1)
}


fun main(){
    //println(migratoryBirds(intArrayOf(1,1,2,2,3)))
    //println(getPossibleSum(intArrayOf(1,3,19,5,46,4,2,7),6))
}


fun migratoryBirds(input: IntArray): Int {
    val birdsHash = hashMapOf<Int,Int>()
    input.forEach {
        birdsHash[it] = (birdsHash[it] ?: 0) + 1
    }
    var mostCommonBird = Pair(-1, -1)
    birdsHash.forEach {
        if(mostCommonBird.second < it.value) mostCommonBird = Pair(it.key,it.value)
    }
    return mostCommonBird.first
}


//2. Find all pairs in an unsorted integer array whose sum is equal to given number.
// //Example: Array: [1,3,19,5,46,4,2,7]; Number to find: 6; Output: "[{4,2},{5,1}]"

fun getPossibleSum(nums : IntArray,k:Int):List<Pair<Int,Int>> {
    val numsHash = hashMapOf<Int,Int>()
    nums.forEach {
        numsHash[it] = it
    }
    val output = mutableListOf<Pair<Int,Int>>()
    nums.forEach {
        val match = k - it
        if(match < 0 || match == it) return@forEach
        if(numsHash[match] != null) {
            output.add(Pair(it,numsHash[match]!!))
            numsHash.remove(it)
        }
    }
    return output.toList()
}

fun findSpecificWords(inputString: String, wordsToFind: List<String>): List<String> {
    val foundWords = mutableListOf<String>()

    for (word in wordsToFind) {
        if (word.lowercase() in inputString.lowercase()) {
            foundWords.add(word)
        }
    }

    return foundWords
}
