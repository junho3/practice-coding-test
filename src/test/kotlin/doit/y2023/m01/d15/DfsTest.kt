package doit.y2023.m01.d15

import io.kotest.core.spec.style.DescribeSpec

class DfsTest : DescribeSpec({

    lateinit var dfs: Dfs

    beforeSpec {
        dfs = Dfs()
    }

    describe("run 메소드는") {
        context("시작 인덱스 1이 주어졌을 때") {
            val start = 1
            it("DFS 탐색을 한다.") {
                dfs.run(start)
            }
        }
    }
})
