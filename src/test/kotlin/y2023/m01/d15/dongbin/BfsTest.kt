package y2023.m01.d15.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class BfsTest : DescribeSpec({

    lateinit var bfs: Bfs

    beforeSpec {
        bfs = Bfs()
    }

    describe("run 메소드는") {
        context("시작 인덱스 1이 주어졌을 때") {
            val start = 1
            val expected = listOf(1, 2, 3, 8, 7, 4, 5, 6)
            it("BFS 탐색을 한다.") {
                bfs.run(start)

                bfs.results.forEachIndexed { index, result ->
                    result shouldBe expected[index]
                }
            }
        }
    }
})
