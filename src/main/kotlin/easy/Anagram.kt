package easy


fun main(){
    groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))
}

fun groupAnagrams(input:Array<String>): List<List<String>>{
    if(input.size == 1) return listOf(listOf(input.first()))

    val auxInput = input.toMutableList()
    val output = arrayListOf<List<String>>()

    while(auxInput.isNotEmpty()){
        val anagrams = arrayListOf<String>()
        anagrams.add(auxInput.first())
        auxInput.forEachIndexed { index , value ->
            if(index > 0){
                if(isAnagram(input.first(),value)) anagrams.add(value)
            }
        }
        output.add(anagrams)
        auxInput.removeAll(anagrams)
    }

    return output
}


fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false
    val sAnagramHashMap = hashMapOf<Char,Int>()
    val tAnagramHashMap = hashMapOf<Char,Int>()
    for(i in 0 .. s.lastIndex){
        sAnagramHashMap[s[i]] = (sAnagramHashMap[s[i]] ?: 0) + 1
        tAnagramHashMap[t[i]] = (tAnagramHashMap[t[i]] ?: 0) + 1
    }
    return sAnagramHashMap == tAnagramHashMap
}