package easy

//https://leetcode.com/problems/majority-element/
fun main(){

}

fun majorityElement2(nums: IntArray): Int {
    nums.sort()
    return nums[nums.size/2]
}

fun majorityElement(nums: IntArray): Int {
    val hashmap = hashMapOf<Int,Int>()
    nums.forEach {
        hashmap[it] = (hashmap[it] ?: 0) + 1
    }
    var greater = Pair(0,0)
    hashmap.forEach {
        if(it.value > greater.second)
            greater = Pair(it.key,it.value)
    }
    return greater.first
}