package leetcode.easy;

public class Solution9 {
    public boolean isPalindrome(int x) {
        String text = String.valueOf(x);
        int i = 0;
        int j = text.length() - 1;

        boolean result = true;
        while (i < j) {
            char iChar = text.charAt(i);
            char jChar = text.charAt(j);

            if (iChar != jChar) {
                result = false;
                break;
            }

            i++;
            j--;
        }

        return result;
    }
}
