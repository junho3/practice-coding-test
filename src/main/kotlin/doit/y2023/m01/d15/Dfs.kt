package doit.y2023.m01.d15

class Dfs {
    var graph: ArrayList<ArrayList<Int>> = ArrayList()
    var visited = BooleanArray(9)

    init {
        for (i: Int in 0..8) {
            graph.add(arrayListOf())
        }

        // 노드 1에 연결된 노드 정보 저장
        graph[1].add(2)
        graph[1].add(3)
        graph[1].add(8)

        // 노드 2에 연결된 노드 정보 저장
        graph[2].add(1)
        graph[2].add(7)

        // 노드 3에 연결된 노드 정보 저장
        graph[3].add(1)
        graph[3].add(4)
        graph[3].add(5)

        // 노드 4에 연결된 노드 정보 저장
        graph[4].add(3)
        graph[4].add(5)

        // 노드 5에 연결된 노드 정보 저장
        graph[5].add(3)
        graph[5].add(4)

        // 노드 6에 연결된 노드 정보 저장
        graph[6].add(7)

        // 노드 7에 연결된 노드 정보 저장
        graph[7].add(2)
        graph[7].add(6)
        graph[7].add(8)

        // 노드 8에 연결된 노드 정보 저장
        graph[8].add(1)
        graph[8].add(7)
    }

    fun run(x: Int) {
        visited[x] = true

        println("$x ")

        for (index in graph[x].indices) {
            val y = graph[x][index]

            if (!visited[y]) {
                run(y)
            }
        }
    }
}
