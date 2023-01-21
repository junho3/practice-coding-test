package y2023.m01.d21.dongbin

class Chess {
    fun run(location: String): Int {
        // a > 1
        // b > 2

        // 1, a | 1, b | 1, c
        // 2, a | 2, b | 2, c
        // 3, a | 3, b | 3, c

        // 1, 1 | 1, 2 | 1, 3
        // 2, 1 | 2, 2 | 2, 3
        // 3, 1 | 3, 2 | 3, 3

        var count = 0
        val x = location[1].digitToInt()
        val y = alphabets.indexOf(location[0].toString()) + 1

        if (moveRight(y)) {
            moveUp(x).let { if (it) { count++ } }
            moveDown(x).let { if (it) { count++ } }
        }

        if (moveLeft(y)) {
            moveUp(x).let { if (it) { count++ } }
            moveDown(x).let { if (it) { count++ } }
        }

        if (moveUp(x)) {
            moveRight(y).let { if (it) { count++ } }
            moveLeft(y).let { if (it) { count++ } }
        }

        if (moveDown(x)) {
            moveRight(y).let { if (it) { count++ } }
            moveLeft(y).let { if (it) { count++ } }
        }

        return count
    }

    private fun moveRight(y: Int): Boolean {
        if (y + 1 > 8) {
            return false
        }

        return true
    }

    private fun moveLeft(y: Int): Boolean {
        if (y - 1 < 1) {
            return false
        }

        return true
    }

    private fun moveUp(x: Int): Boolean {
        if (x - 1 < 1) {
            return false
        }

        return true
    }

    private fun moveDown(x: Int): Boolean {
        if (x + 1 > 8) {
            return false
        }

        return true
    }

    companion object {
        val alphabets = listOf("a", "b", "c", "d", "e", "f", "g", "h")
    }
}
