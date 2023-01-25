package y2023.m01.d25.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class RiceCakeTest : DescribeSpec({
    val riceCake = RiceCake()

    describe("run 메소드는") {
        context("떡의 길이가 저장된 배열과 원하는 떡의 길이 6이 주어졌을 때") {
            val riceCakes = listOf(19, 15, 10, 17)
            val target = 6
            it("절단기의 길이 15를 리턴한다.") {
                val result = riceCake.run(riceCakes, target)
                result shouldBe 15
            }
        }
    }
})
