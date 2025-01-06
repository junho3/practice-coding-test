package leetcode.easy;

public class Solution680 {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char iChar = s.charAt(i);
            char jChar = s.charAt(j);

            if (iChar != jChar) {
                return subValid(i + 1, j, s) || subValid(i, j - 1, s);
            }

            i++;
            j--;
        }

        return true;
    }

    private boolean subValid(int i, int j, String s) {
        while (i < j) {
            char iChar = s.charAt(i);
            char jChar = s.charAt(j);

            if (iChar != jChar) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
