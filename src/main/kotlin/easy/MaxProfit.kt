package easy

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Input: prices = [7,1,5,3,6,4]
//Output: 5

fun main(){
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}


fun maxProfit(prices: IntArray): Int {
    val buyList = mutableListOf<Pair<Int,Int>>()
    prices.forEachIndexed { index, value ->
        buyList.add(Pair(index,value))
    }
    buyList.sortBy { it.second.dec() }

    var sell = 0
    var buy = 0
    prices.forEachIndexed { index, i ->
        val auxSum = buyList.filter {
            index < it.first && i < it.second
        }.maxOfOrNull { it.second } ?: 0
        if(auxSum > sell){
            sell = auxSum
            buy = i
        }
    }

    return sell - buy
}