package y2023.m01.d21.dongbin

class Matrix {
    fun run(size: Int, directions: List<String>): Pair<Int, Int> {
//           x
//      y 0, 1 | 0, 2 | 0, 3
//        1, 1 | 1, 2 | 1, 3
//        2, 1 | 2, 2 | 2, 3
//        3, 1 | 3, 2 | 3, 3
        return directions.fold(Pair(1, 1)) { location, direction ->
            when (direction) {
                "U" -> moveUp(location.first, location.second)
                "D" -> moveDown(location.first, location.second, size)
                "L" -> moveLeft(location.first, location.second)
                "R" -> moveRight(location.first, location.second, size)
                else -> location
            }
        }
    }

    private fun moveRight(y: Int, x: Int, size: Int): Pair<Int, Int> {
        if (x + 1 > size) {
            return Pair(y, x)
        }

        return Pair(y, x + 1)
    }

    private fun moveLeft(y: Int, x: Int): Pair<Int, Int> {
        if (x - 1 < 1) {
            return Pair(y, x)
        }

        return Pair(y, x - 1)
    }

    private fun moveDown(y: Int, x: Int, size: Int): Pair<Int, Int> {
        if (y + 1 > size) {
            return Pair(y, x)
        }

        return Pair(y + 1, x)
    }

    private fun moveUp(y: Int, x: Int): Pair<Int, Int> {
        if (y - 1 < 1) {
            return Pair(y, x)
        }

        return Pair(y - 1, x)
    }
}
