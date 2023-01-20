package y2023.m01.d20.dongbin

class BiggestWay {
    fun run(textNumber: String): Int {
        return textNumber.fold(0) { result, number ->
            val m = number.digitToInt()

            if (result > 1 && m > 1) {
                result * m
            } else {
                result + m
            }
        }
    }
}
