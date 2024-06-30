package leetcode.easy.solution28

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var result = -1
        val length = haystack.length - needle.length
        for (i in 0 .. length) {
            if (haystack.substring(i, i + needle.length) == needle) {
                result = i
                break
            }
        }

        return result
    }
}
