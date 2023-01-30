package y2023.m01.d30.doit

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class FindOBigNumberTest : DescribeSpec({
    val findOBigNumber = FindOBigNumber()

    describe("run 메소드는") {
        context("수열이 주어졌을 때") {
            val numbers = listOf(3, 5, 2, 7)
            it("오큰수로된 숫자형 배열을 리턴한다.") {
                val result = findOBigNumber.run(numbers)

                result.first() shouldBe 5
                result.last() shouldBe -1
            }
        }
    }
})
