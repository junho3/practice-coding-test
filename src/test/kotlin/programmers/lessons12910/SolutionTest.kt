package programmers.lessons12910

import io.kotest.core.spec.style.FunSpec

class SolutionTest : FunSpec({

    test("solution") {
        val solution = Solution()
        val arr = intArrayOf(5, 9, 7, 10)
        val divisor = 5

        val result = solution.solution(arr, 5)

        println(result)
    }
})
