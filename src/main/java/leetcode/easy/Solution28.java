package leetcode.easy;

public class Solution28 {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // Input: haystack = "sadbutsad", needle = "sad"
        // Output: 0
        int result = -1;
        if (m > n) {
            return result;
        }

        // haystack을 돌면서 검사
        for (int i = 0; i < n - m + 1; i++) {
            // haystack[i]가 needle[0]과 같다면
            if (haystack.charAt(i) == needle.charAt(0)) {
                String tempHaystack = haystack;
                String text = tempHaystack.substring(i, i + m);

                // haystack[i ~ length]와 needle[i ~ length] 검증
                if (text.equals(needle)) {
                    return i;
                }
            }
        }

        return result;
    }
}
