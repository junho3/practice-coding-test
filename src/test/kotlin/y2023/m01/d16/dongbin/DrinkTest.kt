package y2023.m01.d16.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class DrinkTest : DescribeSpec({

    lateinit var drink: Drink
    lateinit var graph: ArrayList<ArrayList<Int>>

    beforeSpec {
        graph = arrayListOf(
            arrayListOf(0, 0, 1, 1, 0),
            arrayListOf(0, 0, 0, 1, 1),
            arrayListOf(1, 1, 1, 1, 1),
            arrayListOf(0, 0, 0, 0, 0)
        )

        drink = Drink(graph)
    }

    describe("run 메소드는") {
        context("graph가 주어졌을 때") {
            it("음료수 3개를 리턴한다.") {
                val result = drink.run()

                result shouldBe 3
            }
        }
    }
})
