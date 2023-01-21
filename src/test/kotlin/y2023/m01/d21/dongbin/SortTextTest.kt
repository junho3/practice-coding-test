package y2023.m01.d21.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class SortTextTest : DescribeSpec({
    lateinit var sortText: SortText

    beforeSpec {
        sortText = SortText()
    }

    describe("run 메소드는") {
        context("문자열 'K1KA5CB7'이 주어질 경우") {
            val text = "K1KA5CB7"
            it("문자열을 재정렬하여 'ABCKK13'을 리턴한다.") {
                val result = sortText.run(text)
                result shouldBe "ABCKK13"
            }
        }

        context("문자열 'AJKDLSI412K4JSJ9D'이 주어질 경우") {
            val text = "AJKDLSI412K4JSJ9D"
            it("문자열을 재정렬하여 'ADDIJJJKKLSS20'을 리턴한다.") {
                val result = sortText.run(text)
                result shouldBe "ADDIJJJKKLSS20"
            }
        }
    }
})
