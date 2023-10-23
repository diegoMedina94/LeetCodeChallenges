package easy

//https://leetcode.com/problems/plus-one/?envType=featured-list&envId=top-amazon-questions%3FenvType%3Dfeatured-list&envId=top-amazon-questions


fun main(){
    plusOne(intArrayOf(1,2,3))
}

fun plusOne2(digits: IntArray): IntArray {
    var inc = digits.size
    var digit = 0
    digits.forEach {
        digit += it * inc
        inc *= 10
    }
    digit++
    return digit.toString().map {
        it.digitToInt()
    }.toIntArray()
}