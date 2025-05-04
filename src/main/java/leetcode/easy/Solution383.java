package leetcode.easy;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 시간 복잡도 O(N + M)
        // 공간 복잡도 O(1)

        int[] alphabets = new int[26];
        for (char ch : magazine.toCharArray()) {
            alphabets[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            alphabets[ch - 'a']--;

            if (alphabets[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
