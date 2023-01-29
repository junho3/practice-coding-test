package y2023.m01.d29.doit

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class FindGoodNumberTest : DescribeSpec({
    val findGoodNumber = FindGoodNumber()

    describe("run 메소드는") {
        context("Int형 리스트 1~10이 주어졌을 때") {
            val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            it("두 수의 합인 수의 개수 8을 리턴한다.") {
                val result = findGoodNumber.run(numbers)

                result shouldBe 8
            }
        }
    }
})
