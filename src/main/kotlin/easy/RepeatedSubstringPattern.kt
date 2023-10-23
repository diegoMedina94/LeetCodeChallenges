package easy

//https://leetcode.com/problems/repeated-substring-pattern/


fun main() {
    repeatedSubstringPattern("abab")
}

/*
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:*/

fun repeatedSubstringPattern(s: String): Boolean {
    if (s.length == 1) return false
    var subIndex = s.length/2
    var subS = s.substring(0, subIndex)
    while(subIndex > 0){
        var actualSubS = subS
        while(actualSubS.length <= s.length){
            if(actualSubS == s) return true
            actualSubS += subS
        }
        subIndex--
        subS = s.substring(0, subIndex)
    }
    return false
}