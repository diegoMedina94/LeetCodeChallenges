package medium

//https://leetcode.com/problems/top-k-frequent-elements/description/
//SOLVED
fun main() {
    println(topKFrequent(intArrayOf(3,0,1,0),1).toString())
}

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val counterHash = hashMapOf<Int,Int>()
    nums.forEach {
        counterHash[it] = (counterHash[it] ?: 0) + 1
    }
    val output = counterHash.toList().sortedByDescending { (_, value) -> value }.subList(0,k)

    return output.map {
        it.first
    }.toIntArray()
}