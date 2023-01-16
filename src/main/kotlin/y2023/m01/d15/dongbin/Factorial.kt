package y2023.m01.d15.dongbin

class Factorial {
    fun factorial(number: Int): Int {
        if (number <= 1) {
            return 1
        }

        return number.times(factorial(number.minus(1)))
    }
}
