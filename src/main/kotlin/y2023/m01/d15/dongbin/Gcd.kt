package y2023.m01.d15.dongbin

class Gcd {
    fun gcd(number1: Int, number2: Int): Int {
        if (number1.mod(number2) == 0) {
            return number2
        }

        return gcd(number2, number1.mod(number2))
    }
}
