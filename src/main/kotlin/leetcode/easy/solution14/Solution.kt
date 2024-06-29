package leetcode.easy.solution14

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val minStrings = strs
            .minBy { it.length }
            .toCharArray()

        var result = ""
        var isSame = true
        for (i in minStrings.indices) {
            for (j in strs.indices) {
                if (minStrings[i] != strs[j][i]) {
                    isSame = false
                    break
                }
            }

            if (!isSame) {
                break
            }

            result += minStrings[i]
        }

        return result
    }
}
