package easy

//https://leetcode.com/problems/can-place-flowers/
fun main(){
    print(canPlaceFlowers(intArrayOf(0,0,0,0,0,1,0,0),0))
}

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var auxN = n
    flowerbed.forEachIndexed { index, i ->
        var prevSpot: Int? = null
        if(index > 0) prevSpot = flowerbed[index - 1]
        var nextSpot: Int? = null
        if(index < flowerbed.size - 1) nextSpot = flowerbed[index + 1]

        if(prevSpot != 1  && nextSpot != 1 && i != 1) {
            flowerbed[index] = 1
            auxN--
        }
        if(auxN <= 0) return true
    }
    return false
}
