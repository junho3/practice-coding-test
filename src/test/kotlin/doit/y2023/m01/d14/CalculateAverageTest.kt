package doit.y2023.m01.d14

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

class CalculateAverageTest : DescribeSpec({

    lateinit var calculateAverage: CalculateAverage

    beforeSpec {
        calculateAverage = CalculateAverage()
    }

    describe("calculateAverage 메소드는") {
        context("Int형 배열로 된 points 리스트가 주어졌을 때") {
            val points = arrayOf(1, 2, 4, 8, 16)
            it("새롭게 평균 값을 구하여 float형으로 리턴한다.") {
                val result = calculateAverage.calculateAverage(points)

                result.shouldBeInstanceOf<Float>()
                result shouldBe 38.75f
            }
        }
    }
})
