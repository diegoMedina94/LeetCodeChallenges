package easy

//https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/

fun main(){
    print(greatestLetter2("nzmguNAEtJHkQaWDVSKxRCUivXpGLBcsjeobYPFwTZqrhlyOIfdM"))
    greatestLetter2("\"EtaJrJnREOEaurJiCrwnMbUFElllBiCEKbTpbxKUfMVGkBPfrIyOljQQRsVjHqzgAGRQUjoymVNtWKwaylLGiATlpogDvzOqvkpoCpAsFaRNoZlBPygruHhPPqaCHAZzBCcLqAAxxCWrznQpmOMhcqpWIsdKXRiMQTXQBmfPhavhFtUHEVOGHtpisJUVhYvFYvhCChqzwyNXfVPIWpQAdPXttDurohPkjXgaETvoCJQmFpVSoYgOMwxZPniKDmvDEoSxLEIHacAageesFOfXyBwiGIrhxgqKjEKbqpONKEkwlyQxlbMzdEYORwXwAqbnDcaijrVuEvtqjDUWiNCgBLYyNRPIrAkRACFtyzBvDpqJbuZhNlVPWpmKfxeuxIMFgtKZSsXJBCFkgybAKLLouWBFNIacSwvxRKcFUOVzrOcLCCnmHIHUDoVzAJTnZLtjdCHIrmpylnOZQaXwIYXARFbpVMnGiFhgZNcfEjAyPXUPPfKeCbuKQndqHQFCIwmDxeADMdidDusoRVPHUQHTsesjnshnvrUstvyrUuVfhsNVukFuhtibcAhwljaoBQUIrBlVukJorxmjmvJbjqOYycWuiairqSCPtzCYesqMnEaKcmXGeaspjWOcpYgsPakeMRhIUyjEMyIzgHLHSwwbDmOfpVkGFYsVakurdxllEzXkUtUCDYQrRNXEJihyheicfPyShXJDlnFpgMyhdlouubKPsBDETQKoUzDfJuBgOVkwzflYihhKgjzTNtlDUqxBcRCbDVMYFbESsQzLeLMTbBdtDAdzYZiHgnXagkUfGbGMPrwXVhAWWJudUDSFyDhJRmrulylFNdsLSvHnSYmIPwDncowYlfrSoQRbbDLPmzSfbtYmZPndnMjvuTBcSWNegdTCIPYehqkrpGocrWeBOUyjUPMuZPDqJxCbVihdrVYeYiITFKsuPVuuplSIMCcRSekydnEeNrXKjAQoicZMfrkMSEaTevwBpTqmKwz")
}

fun greatestLetter(s: String): String {
    val upperCaseMap = mutableMapOf<Char,Int>()
    val lowerCaseMap = mutableMapOf<Char,Int>()
    val possibleChar = mutableSetOf<Char>()
    s.forEach {
        if(it.isUpperCase()){
            upperCaseMap[it] = (upperCaseMap[it] ?: 0) + 1
            if(lowerCaseMap[it.lowercaseChar()] != null) possibleChar.add(it.lowercaseChar())
        }else{
            lowerCaseMap[it] = (lowerCaseMap[it] ?: 0) + 1
            if(upperCaseMap[it.uppercaseChar()] != null) possibleChar.add(it)
        }
    }
    var greatest = Pair('_',-1)
    possibleChar.forEach {
        val tempSum = upperCaseMap[it.uppercaseChar()]!! + lowerCaseMap[it]!!
        if(greatest.second < tempSum) greatest = Pair(it,tempSum)
    }
    return if(greatest.second > 0) greatest.first.toString() else ""
}

fun greatestLetter2(s: String): String {
    val upperCaseMap = mutableMapOf<Char,Int>()
    val lowerCaseMap = mutableMapOf<Char,Int>()
    val possibleChar = mutableSetOf<Char>()
    s.forEach {
        if(it.isUpperCase()){
            upperCaseMap[it] = (upperCaseMap[it] ?: 0) + 1
            if(lowerCaseMap[it.toLowerCase()] != null) possibleChar.add(it.toLowerCase())
        }else{
            lowerCaseMap[it] = (lowerCaseMap[it] ?: 0) + 1
            if(upperCaseMap[it.toUpperCase()] != null) possibleChar.add(it)
        }
    }
    var greatest = Pair('_',-1)
    possibleChar.sorted().forEach {
        val tempSum = upperCaseMap[it.toUpperCase()]!! + lowerCaseMap[it]!!
        if(greatest.second <= tempSum) greatest = Pair(it,tempSum)
    }
    return if(greatest.second > 0) greatest.first.toString().toUpperCase() else ""
}