package y2023.m01.d21.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class MatrixTest : DescribeSpec({
    lateinit var matrix: Matrix

    beforeSpec {
        matrix = Matrix()
    }

    describe("run 메소드는") {
        context("matrix size 5와 이동 경로 리스트를 넘기면") {
            val size = 5
            val directions = listOf("R", "R", "R", "U", "D", "D")
            it("이동 결과 좌표(3, 4)를 리턴한다.") {
                val result = matrix.run(size, directions)
                result shouldBe Pair(3, 4)
            }
        }
    }
})
