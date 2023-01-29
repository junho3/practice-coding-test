package y2023.m01.d29.doit

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class SlidingWindowTest : DescribeSpec({
    val slidingWindow = SlidingWindow()

    afterTest {
        slidingWindow.init()
    }

    describe("run 메소드는") {
        context("dna 리스트와 부분 dna 유효길이 8, 부분 dna에 포함되야할 문자의 개수가 주어졌을 때") {
            val dnas = listOf("C", "C", "T", "G", "G", "A", "T", "T", "G")
            val length = 8
            val validations = listOf(2, 0, 1, 1) // ACGT
            it("해당하는 숫자의 개수 0을 리턴한다.") {
                val result = slidingWindow.run(dnas, length, validations)

                result shouldBe 0
            }
        }

        context("dna 리스트와 부분 dna 유효길이 2, 부분 dna에 포함되야할 문자의 개수가 주어졌을 때") {
            val dnas = listOf("G", "A", "T", "A")
            val length = 2
            val validations = listOf(1, 0, 0, 1) // ACGT
            it("해당하는 숫자의 개수 2을 리턴한다.") {
                val result = slidingWindow.run(dnas, length, validations)

                result shouldBe 2
            }
        }
    }
})
