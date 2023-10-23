package easy

//https://leetcode.com/problems/missing-number/
fun main(){
    println(missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
}

fun missingNumber(nums: IntArray): Int {
    //0 1 3 4
    val auxNums = IntArray(nums.size + 1)
    nums.forEach {
        auxNums[it] = 1
    }
    auxNums.forEachIndexed { index , i ->
         if( i != 1) return index
    }
    return -1
}