package easy

//https://leetcode.com/problems/happy-number/
fun main(){
    print(isHappy(19))
}

fun isHappy(n: Int): Boolean {
    var auxNumber = n
    while(auxNumber < Int.MAX_VALUE){
        if(auxNumber == 1) return true
        var tempNumber = 0
        auxNumber.toString().forEach {
            tempNumber += it.toString().toInt() * it.toString().toInt()
        }
        auxNumber = tempNumber
    }
    return false
}