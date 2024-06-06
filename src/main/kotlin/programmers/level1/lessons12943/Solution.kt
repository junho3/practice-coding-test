package programmers.level1.lessons12943

class Solution {
    fun solution(num: Int): Int {
        var answer = 0

        var count = 0
        var number = num.toLong()
        while (number > 1) {
            if (number % 2 == 0L) {
                number = number / 2
            } else {
                number = (number * 3) + 1
            }
            count++

            if (count > 500) {
                count = -1
                break
            }
        }

        answer = count

        return answer
    }
}
