package leetcode.easy;

public class Solution125 {

    public boolean isPalindrome(String s) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(leftChar) || leftChar == ' ') {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar) || rightChar == ' ') {
                right--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
