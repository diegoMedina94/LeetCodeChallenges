package medium

//https://leetcode.com/problems/longest-consecutive-sequence/description/
fun main(){
    longestConsecutive(intArrayOf(1,100,200,0,3,2,4))
}
fun longestConsecutive(nums: IntArray): Int {
    val set =HashSet<Int>()
    nums.forEach{
        set.add(it)
    }

    var maxLength = 0
    for(num in nums){
        if(!set.contains(num-1)){
            var currentLength = 1
            var currentNum = num + 1
            while(set.contains(currentNum)){
                currentLength++
                currentNum++
            }
            maxLength = maxOf(maxLength, currentLength)
        }
    }
    return maxLength
}