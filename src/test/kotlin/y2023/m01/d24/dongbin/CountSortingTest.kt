package y2023.m01.d24.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class CountSortingTest : DescribeSpec({
    val countSorting = CountSorting()

    describe("run 메소드는") {
        context("숫자로 된 배열이 주어진 경우") {
            val numbers = listOf(7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2)
            it("계수정렬을 수행한다.") {
                val result = countSorting.run(numbers)
                result.first() shouldBe 0
                result.last() shouldBe 9
            }
        }
    }
})
