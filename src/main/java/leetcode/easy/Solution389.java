package leetcode.easy;

public class Solution389 {
    public char findTheDifference(String s, String t) {
        int[] alphabets = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabets[s.charAt(i) - 'a']++;
        }

        char result = 'a';
        for (int i = 0; i < t.length(); i++) {
            if (alphabets[t.charAt(i) - 'a'] == 0) {
                result = t.charAt(i);
                break;
            }
            alphabets[t.charAt(i) - 'a']--;
        }

        return result;
    }
}
