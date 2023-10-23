package medium

//https://leetcode.com/problems/valid-sudoku/
fun main(){
    println(isValidSudoku(arrayOf(
        charArrayOf('5','3','.','.','7','.','.','.','.')
        ,charArrayOf('6','.','.','1','9','5','.','.','.')
        ,charArrayOf('.','9','8','.','.','.','.','6','.')
        ,charArrayOf('8','.','.','.','6','.','.','.','3')
        ,charArrayOf('4','.','.','8','.','3','.','.','1')
        ,charArrayOf('7','.','.','.','2','.','.','.','6')
        ,charArrayOf('.','6','.','.','.','.','2','8','.')
        ,charArrayOf('.','.','.','4','1','9','.','.','5')
        ,charArrayOf('.','.','.','.','8','.','.','7','9'))))

    val perro : String = ""
    val perro2 : String = perro.orEmpty()
}

fun isValidSudoku(board: Array<CharArray>): Boolean {
    var xPointer = 0
    var yPointer: Int
    while(xPointer < board.size){
        val row = board[xPointer]
        var numbers = arrayOfNulls<Char>(board.size)
        row.forEach {
            if(it != '.'){
                if(numbers[it.code] == null) numbers[it.code] = it
                else return false
            }
        }
        yPointer = 0
        numbers = arrayOfNulls(board.size)
        while(yPointer < board.size){
            val rowAndColumn = board[yPointer][xPointer]
            if(rowAndColumn != '.') {
                if (numbers[rowAndColumn.code] == null) numbers[rowAndColumn.code] = rowAndColumn
                else return false
            }
            yPointer++
        }
        xPointer++
    }
    return true
}