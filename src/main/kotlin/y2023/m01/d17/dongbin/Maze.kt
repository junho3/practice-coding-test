package y2023.m01.d17.dongbin

import java.util.*

class Maze(
    private val graph: ArrayList<ArrayList<Int>>
) {
    fun run(): Int {
        return bfs(0, 0)
    }

    private fun bfs(startX: Int, startY: Int): Int {
        // 1. 큐 객체를 생성하고, 초기값을 셋팅함
        val queue: Queue<Node> = LinkedList()
        queue.offer(Node(startX, startY))

        do {
            // 1. 큐에서 좌표값을 가져옴
            val node = queue.poll()

            // 2. 상, 우, 하, 좌 방향대로 움직이며, 벨리데이션 체크 및 큐에 인서트, 이동할 곳의 카운트 값 증가
            moveUp(node.x, node.y, queue)
            moveRight(node.x, node.y, queue)
            moveDown(node.x, node.y, queue)
            moveLeft(node.x, node.y, queue)
        } while (queue.isNotEmpty())

        return graph[graph.size - 1][graph[0].size - 1]
    }

    private fun moveUp(x: Int, y: Int, queue: Queue<Node>) {
        // 이동할 곳이 범위 밖인 경우 종료
        if (y - 1 < 0) {
            return
        }

        // 이동할 곳이 벽(0)인 경우 종료
        if (graph[x][y - 1] == 0) {
            return
        }

        // 이동할 곳이 길(1)인 경우 큐에 넣고, 값을 증가 시킴
        if (graph[x][y - 1] == 1) {
            queue.offer(Node(x, y - 1))
            graph[x][y - 1] = graph[x][y] + 1
        }
    }

    private fun moveRight(x: Int, y: Int, queue: Queue<Node>) {
        if (x + 1 >= graph.size) {
            return
        }

        if (graph[x + 1][y] == 0) {
            return
        }

        if (graph[x + 1][y] == 1) {
            queue.offer(Node(x + 1, y))
            graph[x + 1][y] = graph[x][y] + 1
        }
    }

    private fun moveDown(x: Int, y: Int, queue: Queue<Node>) {
        if (y + 1 >= graph[0].size) {
            return
        }

        if (graph[x][y + 1] == 0) {
            return
        }

        if (graph[x][y + 1] == 1) {
            queue.offer(Node(x, y + 1))
            graph[x][y + 1] = graph[x][y] + 1
        }
    }

    private fun moveLeft(x: Int, y: Int, queue: Queue<Node>) {
        if (x - 1 < 0) {
            return
        }

        if (graph[x - 1][y] == 0) {
            return
        }

        if (graph[x - 1][y] == 1) {
            queue.offer(Node(x - 1, y))
            graph[x - 1][y] = graph[x][y] + 1
        }
    }

    data class Node(val x: Int, val y: Int)
}
