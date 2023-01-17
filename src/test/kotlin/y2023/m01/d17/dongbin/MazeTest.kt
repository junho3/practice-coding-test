package y2023.m01.d17.dongbin

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class MazeTest : DescribeSpec({

    lateinit var maze: Maze
    lateinit var graph: ArrayList<ArrayList<Int>>

    beforeSpec {
        graph = arrayListOf(
            arrayListOf(1, 0, 1, 0, 1, 0),
            arrayListOf(1, 1, 1, 1, 1, 1),
            arrayListOf(0, 0, 0, 0, 0, 1),
            arrayListOf(1, 1, 1, 1, 1, 1),
            arrayListOf(1, 1, 1, 1, 1, 1)
        )

        maze = Maze(graph)
    }

    describe("run 메소드는") {
        context("graph가 주어졌을 때") {
            it("최단 경로 10을 리턴한다.") {
                val result = maze.run()

                result shouldBe 10
            }
        }
    }
})
