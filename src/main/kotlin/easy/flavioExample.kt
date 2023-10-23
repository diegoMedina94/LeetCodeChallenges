package easy

fun main(){
    val inputList = listOf(1,2,3,4,4,1,2,3)
    var loop = 0
    var aPointer = 0
    var bPointer = inputList.size -1

    while(aPointer <= bPointer){
        loop++
        println(loop)


        aPointer++
        bPointer--
    }

    /*inputList.forEach {outerElement ->
        inputList.forEach{innerElement ->
            loop++
            if(outerElement == innerElement){
                println("RESULT" + loop)
            }
        }
    }*/

}