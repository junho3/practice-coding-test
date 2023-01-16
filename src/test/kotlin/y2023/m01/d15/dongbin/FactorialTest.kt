package y2023.m01.d15.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class FactorialTest : DescribeSpec({

    lateinit var factorial: Factorial

    beforeSpec {
        factorial = Factorial()
    }

    describe("factorial 메소드는") {
        context("10이 주어졌을 때") {
            val number = 10
            it("3628800를 리턴한다.") {
                val result = factorial.factorial(number)

                result shouldBe 3628800
            }
        }
    }
})
