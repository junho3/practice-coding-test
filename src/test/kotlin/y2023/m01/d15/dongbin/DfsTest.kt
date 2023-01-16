package y2023.m01.d15.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class DfsTest : DescribeSpec({

    lateinit var dfs: Dfs

    beforeSpec {
        dfs = Dfs()
    }

    describe("run 메소드는") {
        context("시작 인덱스 1이 주어졌을 때") {
            val start = 1
            val expected = listOf(1, 2, 7, 6, 8, 3, 4, 5)
            it("DFS 탐색을 한다.") {
                dfs.run(start)

                dfs.results.forEachIndexed { index, result ->
                    result shouldBe expected[index]
                }
            }
        }
    }
})
