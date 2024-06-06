package programmers.level1.lessons12977

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for (first in 0 .. nums.size - 3) {
            for (second in first + 1 .. nums.size - 2) {
                for (third in second + 2 .. nums.size - 1) {
                    val sum = nums[first] + nums[second] + nums[third]

                    if (sum > 1 && (2 until sum).none { sum % it == 0}) {
                        answer++
                    }
                }
            }
        }

        return answer
    }
}
