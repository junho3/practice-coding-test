package programmers.level1.lessons64061

import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0

        val xLength = board.first().size
        val basket = Stack<Int>()
        moves.forEach { y ->
            for (x in 0 until xLength) {
                val dollNumber = board[x][y - 1]

                if (dollNumber != 0) {
                    if (basket.isEmpty()) {
                        basket.push(dollNumber)
                    } else {
                        val basketDollNumber = basket.pop()

                        if (dollNumber == basketDollNumber) {
                            answer += 2
                        } else {
                            basket.push(basketDollNumber)
                            basket.push(dollNumber)
                        }
                    }

                    board[x][y - 1] = 0
                    break
                }
            }
        }



//        val stackBoard: MutableList<Stack<Int>> = mutableListOf()
//        for (i in 0..board.lastIndex) {
//            stackBoard.add(Stack())
//        }
//
//        board.forEachIndexed { y, row ->
//            row.forEachIndexed { x, it ->
//                if (it != 0) {
//                    stackBoard[y].push(it)
//                }
//            }
//        }
//
//        stackBoard.forEach {
//            it.reverse()
//        }
//
//        val basket = Stack<Int>()
//        moves.forEach { x ->
//            val dollNumber = stackBoard[x].pop()
//
//            if (basket.isNotEmpty()) {
//                val basketDollNumber = basket.pop()
//
//                if (dollNumber == basketDollNumber) {
//                    answer++
//                } else {
//                    basket.push(basketDollNumber)
//                    basket.push(dollNumber)
//                }
//            } else {
//                basket.push(dollNumber)
//            }
//        }
//

        return answer
    }
}
