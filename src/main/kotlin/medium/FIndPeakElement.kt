package medium

//https://leetcode.com/problems/find-peak-element/
fun main(){
    print( findPeakElement(intArrayOf(1,2)))
}

fun findPeakElement(nums: IntArray): Int {
    nums.forEachIndexed { index, i ->
        var previous: Int
        var next: Int
        if(index > 0) nums[index -1].let { previous = it }
        else previous = i
        if(index != nums.lastIndex) nums[index +1].let { next = it }
        else next = i
        when{
            (i == next && i > previous) ||
            (i == previous && i > next) ||
            (i > previous  && i > next) ->  return index
        }
    }
    return 0
}