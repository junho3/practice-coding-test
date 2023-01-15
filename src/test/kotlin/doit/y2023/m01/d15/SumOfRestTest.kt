package doit.y2023.m01.d15

import doit.y2023.m01.sumOfRest
import io.kotest.core.spec.style.DescribeSpec

class SumOfRestTest : DescribeSpec({

    describe("sumOfRest 메소드는") {
        context("Int형 배열과 나머지연산숫자가 주어졌을 때") {
            val numbers = listOf(1, 2, 3, 1, 2)
            val remainder = 3
            it("list를 리턴한다.") {
                sumOfRest(numbers, remainder)
            }
        }
    }
})
