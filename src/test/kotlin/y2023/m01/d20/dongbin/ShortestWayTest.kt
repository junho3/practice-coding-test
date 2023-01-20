package y2023.m01.d20.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ShortestWayTest : DescribeSpec({
    lateinit var shortestWay: ShortestWay

    beforeSpec {
        shortestWay = ShortestWay()
    }

    describe("run 메소드를 실행하면") {
        context("totalNumber는 25, division은 5가 주어졌을 때") {
            val totalNumber = 25
            val division = 5
            it("2를 리턴한다.") {
                val result = shortestWay.run(totalNumber, division)
                result shouldBe 2
            }
        }
    }

    describe("run2 메소드를 실행하면") {
        context("totalNumber는 25, division은 5가 주어졌을 때") {
            val totalNumber = 25
            val division = 5
            it("2를 리턴한다.") {
                val result = shortestWay.run2(totalNumber, division)
                result shouldBe 2
            }
        }
    }
})
