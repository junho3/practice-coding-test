package leetcode.easy;

public class Solution344 {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char iChar = s[i];
            char jChar = s[j];

            s[i] = jChar;
            s[j] = iChar;

            i++;
            j--;
        }
    }
}
