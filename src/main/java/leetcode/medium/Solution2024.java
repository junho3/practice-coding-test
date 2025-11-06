package leetcode.medium;

public class Solution2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int[] answers = new int[26];
        int maxCount = 0;
        int longestLength = 0;

        int left = 0;
        for (int right = 0; right < answerKey.length(); right++) {
            answers[answerKey.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, answers[answerKey.charAt(right) - 'A']);

            int length = right - left + 1;
            while (length - maxCount > k) {
                answers[answerKey.charAt(left) - 'A']--;
                left++;

                length = right - left + 1;
            }

            longestLength = Math.max(longestLength, length);
        }

        return longestLength;
    }
}
