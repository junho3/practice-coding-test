package programmers.level1.lessons12969

class Solution {
    fun main(args: Array<String>) {
        val (a, b) = readln().split(' ').map(String::toInt)

        val text = "*".repeat(a)
        for (i in 1 .. b) {
            println(text)
        }
    }
}
