package y2023.m01.d20.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ExchangeCoinTest : DescribeSpec({

    lateinit var exchangeCoin: ExchangeCoin

    beforeSpec {
        exchangeCoin = ExchangeCoin(listOf(500, 100, 50, 10))
    }

    describe("exchange 메소드는") {
        context("1260원 돈을 넘기면") {
            val money = 1260
            it("코인 6개를 리턴한다.") {
                val result = exchangeCoin.exchange(money)

                result shouldBe 6
            }
        }
    }
})
