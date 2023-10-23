//https://leetcode.com/problems/find-pivot-index/

fun main(){
    println(pivotIndex(intArrayOf(-1,-1,-1,-1,0,1)))
}

fun pivotIndex(nums: IntArray): Int {
    nums.forEachIndexed { index, i ->
        val nextIndex = index.plus(1)
        val prevIndex = index.minus(1)
        val rightSum =
            if (nextIndex < nums.size) nums.copyOfRange(nextIndex, nums.size).sumBy { it } else 0
        val leftSum =
            if (prevIndex >= 0) nums.copyOfRange(0, index).sumOf { it } else 0
        if (leftSum == rightSum) return index
    }
    return -1
}













/*
fun pivotIndex(nums: IntArray): Int {
    var left = 0
    var right = nums.sum()
    nums.forEachIndexed { index , number ->
        if(right - number == left ) return index
        left += number
        right -= number
    }

    return -1
}*/
