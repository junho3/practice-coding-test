package y2023.m02.d05.doit

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class SelectSortTest : DescribeSpec({
    val selectSort = SelectSort()

    describe("run 메소드는") {
        context("숫자로 조합된 String 문자열이 주어졌을 때") {
            val text = "2143"
            it("내림차순으로 정렬된 리스트를 리턴한다.") {
                val result = selectSort.run(text)

                result.first() shouldBe 1
                result.last() shouldBe 4
            }
        }
    }
})
