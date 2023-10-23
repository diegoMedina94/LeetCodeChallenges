package easy

//https://leetcode.com/problems/monotonic-array/
fun main(){

}

fun isMonotonic(nums: IntArray): Boolean {
    var isAsc : Boolean? = null
    nums.forEachIndexed loop@{ index, i ->
        if(index == nums.size -1) return@loop
        if(isAsc == null && nums[index] == nums[index + 1]) return@loop
        if(isAsc == null)  isAsc = nums[index] < nums[index + 1]
        if(isAsc!!){
            if(nums[index] > nums[index + 1]) return false
        } else {
            if(nums[index] < nums[index +1]) return false
        }
    }
    return true
}