package leetcode.medium;

public class Solution1456 {
    public int maxVowels(String s, int k) {
        int n = s.length();

        int count = 0;
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                count++;
            }
        }

        int result = count;
        for (int i = 1; i <= n - k; i++) {
            char before = s.charAt(i - 1);
            char after = s.charAt(i + k - 1);

            if (isVowel(before)) {
                count--;
            }

            if (isVowel(after)) {
                count++;
            }

            if (count > result) {
                result = count;
            }
        }

        return result;
    }

    private boolean isVowel(char ch) {
        // aieou 검증하는 방법에 따라 속도 차이가 있음
        // 1. if 문으로 직접 접근이 가장 빠름
        // 2. Map
        // 3. Set
        // 4. List
        if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
