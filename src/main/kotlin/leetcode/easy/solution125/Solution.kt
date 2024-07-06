package leetcode.easy.solution125

class Solution {
    fun isPalindrome(s: String): Boolean {
        val text = s.filter { it.isLetterOrDigit() }
            .map { it.lowercase() }

        var result = true
        for (i in 0 until text.size / 2) {
            if (text[i] != text[text.size - 1 - i]) {
                result = false
                break
            }
        }

        return result
    }
}
