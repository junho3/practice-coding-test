package y2023.m01.d20.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class BiggestWayTest : DescribeSpec({

    lateinit var biggestWay: BiggestWay

    beforeSpec {
        biggestWay = BiggestWay()
    }

    describe("run 메소드는") {
        context("'02984' 숫자로 이루어진 문자열이 주어졌을 때") {
            val textNumber = "02984"
            it("576을 리턴한다.") {
                val result = biggestWay.run(textNumber)

                result shouldBe 576
            }
        }
    }
})
