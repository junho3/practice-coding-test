package leetcode.easy;

public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int words1Length = word1.length();
        int words2Length = word2.length();

        int length = words1Length > words2Length ? words1Length : words2Length;
        for (int i = 0; i < length; i++) {
            if (i < words1Length) {
                sb.append(word1.charAt(i));
            }
            if (i < words2Length) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
