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

        return answer
    }
}
