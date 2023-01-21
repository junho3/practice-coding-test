package y2023.m01.d21.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ChessTest : DescribeSpec({
    lateinit var chess: Chess

    beforeSpec {
        chess = Chess()
    }

    describe("run 메소드는") {
        context("초기 위치 a1이 주어진 경우") {
            val location = "a1"
            it("나이트가 움직일 수 있는 경우의 수 2를 리턴한다.") {
                val result = chess.run(location)
                result shouldBe 2
            }
        }
    }
})
