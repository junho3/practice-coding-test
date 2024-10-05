package leetcode.medium;

public class Solution151 {
    public String reverseWords(String s) {
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"
//        Input: s = "  hello world  "
//        Output: "world hello"

        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" ");
        int n = words.length;
        for (int i = n - 1; i >= 0; i--) {
            String word = words[i];

            if (!word.isEmpty()) {
                sb.append(" ");
                sb.append(word);
            }
        }

        return sb.toString().trim();
    }
}
