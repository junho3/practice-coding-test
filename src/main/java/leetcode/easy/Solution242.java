package leetcode.easy;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabetCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabetCounts[s.charAt(i) - 'a']++;
            alphabetCounts[t.charAt(i) - 'a']--;
        }

        for (int count : alphabetCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
