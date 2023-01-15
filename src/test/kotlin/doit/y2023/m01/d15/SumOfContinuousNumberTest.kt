package doit.y2023.m01.d15

import doit.y2023.m01.SumOfContinuousNumber
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class SumOfContinuousNumberTest : DescribeSpec({

    lateinit var sumOfContinuousNumber: SumOfContinuousNumber

    beforeSpec {
        sumOfContinuousNumber = SumOfContinuousNumber()
    }

    describe("sumOfContinuousNumber 메소드는") {
        context("숫자가 주어졌을 때") {
            val number = 15
            it("연속된 수의 합 개수를 리턴한다.") {
                val result = sumOfContinuousNumber.sumOfContinuousNumber(number)

                result shouldBe 4
            }
        }
    }
})
