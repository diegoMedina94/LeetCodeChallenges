package easy

//https://leetcode.com/problems/is-subsequence/

fun main(){
    isSubsequence("abc","ahbgdc")
}

fun isSubsequence(s: String, t: String): Boolean {

    if(s.isEmpty()) return true
    if(t.isEmpty()) return false
    if(t.contains(s)) return true
    val pastChars = HashMap<Char, Int>()
    var sPointer = 0
    var lastIndex = -1
    t.forEachIndexed { index, c ->
        if(pastChars[c] == null) pastChars[c] = index
        if(pastChars[s[sPointer]] != null){
            if(pastChars[s[sPointer]]!! <= lastIndex) return false
            lastIndex = pastChars[s[sPointer]]!!
            sPointer++
        }
        if(sPointer == s.length) return true
    }
    return sPointer == s.length
}