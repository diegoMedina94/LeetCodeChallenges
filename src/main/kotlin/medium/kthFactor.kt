package medium

//https://leetcode.com/problems/the-kth-factor-of-n/?envType=study-plan-v2&envId=amazon-spring-23-high-frequency

fun main(){
    kthFactor(12, 3)
}

fun kthFactor(n: Int, k: Int): Int {
    val factors = mutableListOf<Int>()
    for(i in 1 until n + 1){
        if(n% i == 0) factors.add(i)
    }
    return if(k-1 > factors.size) -1 else factors[k-1]
}

fun kthFactor2(n: Int, k: Int): Int {
    var counter = 0
    for(i in 1 until n + 1){
        if(n% i == 0) {
            counter ++
            if(counter == k) return i
        }
    }
    return -1
}