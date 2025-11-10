package leetcode.easy;

public class Solution383 {

    // 문자열 ransomNote 문자 개수와 magazine의 문자 개수를 비교하는 문제
    // ransomNote의 문자 개수가 magazine의 문자 개수보다 많을 경우 false 리턴

    public boolean canConstruct(String ransomNote, String magazine) {
        // 시간 복잡도 O(N + M)
        // 공간 복잡도 O(1)

        int[] letters = new int[26];

        int n = magazine.length();
        for (int i = 0; i < n; i++) {
            letters[magazine.charAt(i) - 'a']++;
        }

        int m = ransomNote.length();
        for (int i = 0; i < m; i++) {
            letters[ransomNote.charAt(i) - 'a']--;

            if (letters[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
