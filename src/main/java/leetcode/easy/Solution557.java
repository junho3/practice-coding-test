package leetcode.easy;

public class Solution557 {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            int length = word.length() - 1;

            for (int i = length; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
