package easy

//https://leetcode.com/problems/reverse-words-in-a-string-iii/

/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
*/


fun main(){

}

fun reverseWords(s: String): String {
    val words = s.split(" ")
    val output = StringBuilder()
    for(word in words){
        val aux = StringBuilder()
        for (i in word.length downTo 0){
            aux.append(word[i])
        }
        output.append("$aux ")
    }
    return output.toString().trim()
}