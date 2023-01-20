package y2023.m01.d20.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class GreatestAdventurerGroupTest : DescribeSpec({

    lateinit var greatestAdventurerGroup: GreatestAdventurerGroup

    beforeSpec {
        greatestAdventurerGroup = GreatestAdventurerGroup()
    }

    describe("run 메소드는") {
        context("탐험가 리스트가 주어졌을 때") {
            val adventurers = listOf(2, 3, 1, 2, 2)
            it("탐험가 그룹 수 2를 리턴한다.") {
                val result = greatestAdventurerGroup.run(adventurers)

                result shouldBe 2
            }
        }
    }
})
