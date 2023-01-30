package y2023.m01.d30.doit

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class CardGameTest : DescribeSpec({
    val cardGame = CardGame()

    describe("run 메소드는") {
        context("카드 개수 6이 주어졌을 때") {
            val count = 6
            it("가장 마지막까지 남은 카드번호 4를 리턴한다.") {
                val result = cardGame.run(count)

                result shouldBe 4
            }
        }
    }
})
