package y2023.m01.d24.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ChangeArrayTest : DescribeSpec({
    val changeArray = ChangeArray()

    describe("run 메소드는") {
        context("숫자로 된 배열 2개와 교체회수 3이 주어진 경우") {
            val firstNumbers = listOf(1, 2, 5, 4, 3)
            val secondNumbers = listOf(5, 5, 6, 6, 5)
            val changeCount = 3
            it("첫번째 배열의 합이 최대값이 되도록 만든다.") {
                val result = changeArray.run(firstNumbers, secondNumbers, changeCount)

                result.sum() shouldBe 26
            }
        }
    }

    describe("run2 메소드는") {
        context("숫자로 된 배열 2개와 교체회수 3이 주어진 경우") {
            val firstNumbers = listOf(1, 2, 5, 4, 3)
            val secondNumbers = listOf(5, 5, 6, 6, 5)
            val changeCount = 3
            it("첫번째 배열의 합이 최대값이 되도록 만든다.") {
                val result = changeArray.run2(firstNumbers, secondNumbers, changeCount)

                result.sum() shouldBe 26
            }
        }
    }
})
