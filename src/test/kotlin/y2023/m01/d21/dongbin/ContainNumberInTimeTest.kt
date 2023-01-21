package y2023.m01.d21.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ContainNumberInTimeTest : DescribeSpec({
    lateinit var containNumberInTime: ContainNumberInTime

    beforeSpec {
        containNumberInTime = ContainNumberInTime()
    }

    describe("run 메소드는") {
        context("hour 5가 주어지면") {
            val hour = 5
            it("3이 포함된 시간의 개수 11475를 리턴한다.") {
                val result = containNumberInTime.run(hour)
                result shouldBe 11475
            }
        }
    }
})
