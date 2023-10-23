package easy

import java.util.*


//https://leetcode.com/problems/valid-parentheses/
class ValidParenthesis {
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.forEach {
        when(it){
            '(','[','{' -> stack.push(it)
            else -> {
                if(stack.isNotEmpty()){
                    when(stack.pop()){
                        '(' -> if(it != ')') return false
                        '{' -> if(it != '}') return false
                        '[' -> if(it != ']') return false
                    }
                } else return false
            }
        }
    }
    return stack.isEmpty()
}

