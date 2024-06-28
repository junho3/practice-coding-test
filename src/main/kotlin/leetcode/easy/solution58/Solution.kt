package leetcode.easy.solution58

class Solution {
    fun lengthOfLastWord(s: String): Int {
        return s
            .split(" ")
            .map { it.trim() }
            .last { it.isNotBlank() }
            .length
    }
}
