package medium
//https://leetcode.com/problems/search-in-rotated-sorted-array/

fun main(){

}

fun search(nums: IntArray, target: Int): Int {
    var pointer = 0
    val pointerDirection = nums.first() > nums.last()
    while(pointer <= nums.size){
        if(pointerDirection) pointer++ else pointer--
    }

    return -1
}

fun Boolean?.orFalse(): Boolean = this ?: false
fun Boolean?.orTrue(): Boolean = this ?: true
