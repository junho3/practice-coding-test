package programmers.level2.lessons87946

class Solution {

    private val visited = BooleanArray(8)
    private var answer = 0

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        for (i in dungeons.indices) {
            visited[i] = false
        }

        dfs(0, dungeons, k)

        return answer
    }

    private fun dfs(depth: Int, dungeons: Array<IntArray>, fatigue: Int) {
        for (i in dungeons.indices) {
            val needFatigue = dungeons[i][0]
            if (visited[i] || fatigue < needFatigue) {
                continue
            }

            visited[i] = true
            val useFatigue = dungeons[i][1]
            val remainFatigue = fatigue - useFatigue
            dfs(depth + 1, dungeons, remainFatigue)
            visited[i] = false
        }

        answer = Math.max(answer, depth)
    }
}
