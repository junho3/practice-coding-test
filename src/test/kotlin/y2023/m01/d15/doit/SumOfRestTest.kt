package y2023.m01.d15.doit

import io.kotest.core.spec.style.DescribeSpec

class SumOfRestTest : DescribeSpec({

    lateinit var sumOfRest: SumOfRest

    beforeSpec {
        sumOfRest = SumOfRest()
    }

    describe("sumOfRest 메소드는") {
        context("Int형 배열과 나머지연산숫자가 주어졌을 때") {
            val numbers = listOf(1, 2, 3, 1, 2)
            val remainder = 3
            it("list를 리턴한다.") {
                sumOfRest.sumOfRest(numbers, remainder)
            }
        }
    }
})
