package easy

//https://leetcode.com/problems/reverse-string/
fun main(){

}

fun reverseString(s: CharArray) {
    val aPointer = 0
    val bPointer = s.size - 1
    while(aPointer < bPointer){
        val aux = s[aPointer]
        s[aPointer] = s[bPointer]
        s[bPointer] = aux
    }
}

/*otg?
g|ot|t|o*/
/*val gotto = "gotto"
val input = "otg"*/


