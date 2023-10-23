package easy

import java.util.*

//https://leetcode.com/problems/reverse-vowels-of-a-string/


/*
Input: s = "hello"
Output: "holle"
*/
//SOLVED

fun main() {
    val myStack : Stack<Int> = Stack()
    myStack.add(1)
    myStack.add(1)
    myStack.add(3)
    val myValue = myStack.peek()
    print(myStack)
}
fun reverseVowels(s: String): String {
    val vowels = Stack<Char>()
    val newWord = StringBuilder()
    s.forEach {
        if (it.isVowel()) vowels.add(it)
    }
    s.forEach {
        if (it.isVowel()) newWord.append(vowels.pop())
        else newWord.append(it)
    }
    return newWord.toString()
}

fun Char.isVowel() = when (this) {
    'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
    else -> false
}