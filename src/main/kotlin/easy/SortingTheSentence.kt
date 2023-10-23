package easy


//https://leetcode.com/problems/sorting-the-sentence/
fun main(){

}


fun sortSentence(s: String): String {
    var word = ""
    val sortedMap = hashMapOf<Int,String>()
    s.forEach {
        if(it.isDigit()){
            sortedMap[it.toInt()] = word
            word = ""
        }else{
            word += it
        }
    }
    val setence = StringBuilder()
    sortedMap.forEach {
        setence.append(it.value)
    }
    return setence.toString()
}


/*fun sortSentence(s: String): String {
    val sortedWord = StringBuilder()
    s.split(" ").sortedBy {
        it.last().toInt()
    }.map { sortedWord.append(it.substring(0,it.length -1)+ " ")}

    return sortedWord.toString().trim()
}*/


