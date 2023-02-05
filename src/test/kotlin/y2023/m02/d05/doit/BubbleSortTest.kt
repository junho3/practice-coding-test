package y2023.m02.d05.doit

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class BubbleSortTest : DescribeSpec({
    val bubbleSort = BubbleSort()

    describe("run 메소드는") {
        context("Int형 리스트가 주어졌을 때") {
            val numbers = listOf(5, 2, 3, 4, 1)
            it("오름차순으로 정렬된 리스트를 리턴한다.") {
                val result = bubbleSort.run(numbers)

                result.first() shouldBe 1
                result.last() shouldBe 5
            }
        }
    }
})
