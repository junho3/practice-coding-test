package leetcode.easy;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        // Input: s = "   fly me   to   the moon  "
        // Output: 4

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        // 1. 문자열 순회
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            // 2. 글자가 나오면 temp에 넣기
            if (ch != ' ') {
                sb.append(ch);
            } else {
                // 3. 공백이 나오면 temp 길이 비교
                if (!sb.toString().isBlank()) {
                    return sb.toString().length();
                }
            }
        }

        return sb.toString().length();
    }
}
