package easy

//https://leetcode.com/problems/two-sum/?envType=featured-list&envId=top-amazon-questions?envType=featured-list&envId=top-amazon-questions

fun main() {
    twoSum(intArrayOf(3,2,95,4,-3),92)
}

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

fun twoSum(nums: IntArray, target: Int): IntArray {
    val pastNumbers = hashMapOf<Int,Int>()

    nums.forEachIndexed { index, i ->
        val aux =  target - i
        if(pastNumbers[aux] != null) return intArrayOf(index, pastNumbers[aux]!!)
        pastNumbers[i] = index
    }

    return intArrayOf()
}