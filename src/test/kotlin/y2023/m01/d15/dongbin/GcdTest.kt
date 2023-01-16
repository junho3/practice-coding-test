package y2023.m01.d15.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class GcdTest : DescribeSpec({

    lateinit var gcd: Gcd

    beforeSpec {
        gcd = Gcd()
    }

    describe("gcd(유클리드호제법) 메소드는") {
        context("두 개의 숫자가 주어졌을 때") {
            val number1 = 192
            val number2 = 162
            it("최대공약수 6를 구한다") {
                val result = gcd.gcd(number1, number2)
                result shouldBe 6
            }
        }
    }
})
