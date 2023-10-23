package easy

import java.awt.Window

//https://leetcode.com/problems/count-hills-and-valleys-in-an-array/

fun main(){
    println(countHillValley(intArrayOf(1,1,1)))
}


fun countHillValley(nums: IntArray): Int {
    var count = 0
    var isInc : Boolean? = null
    for(i in nums.indices)  {
        if(i == nums.size - 1) return count
        if(isInc == null && nums[i] != nums[i + 1]){
            isInc = nums[i] > nums[i+1]
        }
        isInc?.let {
            if(isInc!!){
                if(nums[i] < nums[i+1]) {
                    count++
                    isInc = false
                }
            }else{
                if(nums[i] > nums[i+1]) {
                    count++
                    isInc = true
                }
            }
        }
    }
    return count
}

/*
fun countHillValley(nums: IntArray): Int {
    val window = mutableListOf(nums[0],nums[1],nums[2])
    var count = 0
    nums.forEachIndexed { index, i ->
        if(index + 2 < nums.size){
            window[0] = i
            window[1] = nums[index + 1]
            window[2] = nums[index + 2]

            when{
                (window[0] < window[1]) && (window[1] > window[2]) -> count++
                (window[0] == window[1]) && (window[1] > window[2]) -> count++
                (window[0] > window[1]) && (window[1] < window[2]) -> count++
                (window[0] > window[1]) && (window[1] == window[2]) -> count++
            }
        }
    }
    return count
}*/
