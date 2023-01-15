package doit.y2023.m01

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class SumOfContinuousNumberKtTest : DescribeSpec({

    describe("sumOfContinuousNumber 메소드는") {
        context("숫자가 주어졌을 때") {
            val number = 15
            it("연속된 수의 합 개수를 리턴한다.") {
                val result = sumOfContinuousNumber(number)

                result shouldBe 4
            }
        }
    }
})
