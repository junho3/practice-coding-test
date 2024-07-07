package leetcode.easy.solution392

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var index = 0
        for (i in t.indices) {
            if (s.length == index) {
                break
            }

            if (t[i] == s[index]) {
                index++
            }
        }

        return s.length == index
    }
}
