package y2023.m01.d25.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class BinarySearchTest : DescribeSpec({
    val binarySearch = BinarySearch()

    describe("main 메소드는") {
        val numbers = listOf(0, 2, 4, 6, 8, 10, 12, 14, 16, 18)
        val targetNumber = 4
        context("숫자가 정렬된 배열과 찾아야할 수 4가 주어졌을 때") {
            it("탐색 회수 3을 리턴한다.") {
                val result = binarySearch.main(numbers, targetNumber)
                result shouldBe 3
            }
        }
    }
})
