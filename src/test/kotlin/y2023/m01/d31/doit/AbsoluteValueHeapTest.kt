package y2023.m01.d31.doit

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class AbsoluteValueHeapTest : DescribeSpec({
    val absoluteValueHeap = AbsoluteValueHeap()

    describe("run 메소드는") {
        context("숫자 배열이 주어질 경우") {
            val numbers = listOf(1, -1, 0, 0, 0, 1, 1, -1, -1, 2, -2, 0, 0, 0, 0, 0, 0, 0)
            it("결과 숫자 배열을 리턴한다.") {
                val result = absoluteValueHeap.run(numbers)

                result.size shouldBe 10
            }
        }
    }
})
