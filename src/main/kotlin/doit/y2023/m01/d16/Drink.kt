package doit.y2023.m01.d16

class Drink(
    private val graph: ArrayList<ArrayList<Int>>
) {

    fun run(): Int {
        var result = 0

        graph.forEachIndexed { x, _ ->
            graph[x].forEachIndexed { y, _ ->
                if (dfs(x, y)) {
                    result++
                }
            }
        }

        return result
    }

    private fun dfs(x: Int, y: Int): Boolean {
        if (x < 0 || y < 0 || x >= graph.size || y >= graph[0].size) {
            return false
        }

        if (graph[x][y] == 0) {
            graph[x][y] = 1

            // 기준점으로부터 시계방향으로 돌면서 값이 0인지 확인
            dfs(x, y + 1) // 위쪽
            dfs(x + 1, y) // 오른쪽
            dfs(x, y - 1) // 아래쪽
            dfs(x - 1, y) // 왼쪽

            return true
        }

        return false
    }
}
