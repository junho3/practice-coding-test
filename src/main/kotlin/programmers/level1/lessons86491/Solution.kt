package programmers.level1.lessons86491

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0

        var width = 0
        var height = 0
        sizes.forEach { size ->
            val x = size[0]
            val y = size[1]

            if (x > y) {
                if (x > width) {
                    width = x
                }

                if (y > height) {
                    height = y
                }
            } else {
                if (y > width) {
                    width = y
                }

                if (x > height) {
                    height = x
                }
            }
        }

        answer = width * height

        return answer
    }
}
