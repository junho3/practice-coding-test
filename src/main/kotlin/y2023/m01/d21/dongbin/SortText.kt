package y2023.m01.d21.dongbin

class SortText {
    fun run(text: String): String {
        val chars = mutableListOf<Char>()
        val numbers = mutableListOf<Int>()

        text.forEach {
            if (it.isDigit()) {
                numbers.add(it.digitToInt())
            } else {
                chars.add(it)
            }
        }

        return chars.sorted().joinToString("") + numbers.sum()
    }
}
