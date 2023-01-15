package doit.y2023.m01.d14

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

class SumOfRangeTest : DescribeSpec({
    lateinit var sumOfRange: SumOfRange

    beforeSpec {
        sumOfRange = SumOfRange()
    }

    describe("sumOfRange 메소드는") {
        context("Int형 배열과 from ~ to Index가 주어졌을 때") {
            val numbers = listOf(5, 4, 3, 2, 1)
            val fromIndex = 1
            val toIndex = 3
            it("범위의 합을 구하여 리턴한다.") {
                val result = sumOfRange.sumOfRange(numbers, fromIndex, toIndex)

                result.shouldBeInstanceOf<Int>()
                result shouldBe 9
            }
        }
    }
})
