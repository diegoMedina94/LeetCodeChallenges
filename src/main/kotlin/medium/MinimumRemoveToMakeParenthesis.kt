package medium

import java.util.*

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
fun main(){
    println(minRemoveToMakeValid("))(("))
}

//Input: s = "lee(t(c)o)de)"
//Input: s = "lee(t(c)o)de)"
fun minRemoveToMakeValid(s: String): String {
    val openBrackets = Stack<Int>()
    var sAux = s
    var i = 0
    while(i < sAux.length){
        if (sAux[i] == '(') openBrackets.add(i)
        if (openBrackets.isEmpty() && sAux[i] == ')') {
            sAux = sAux.replaceRange(i, i+1, "")
            i--
        }
        if (openBrackets.isNotEmpty() && sAux[i] == ')') {
            openBrackets.pop()
        }

        i++
    }
    while (openBrackets.isNotEmpty()) {
        val remove = openBrackets.pop()
        sAux = sAux.replaceRange(remove, remove+1, "")
    }
    return sAux
}