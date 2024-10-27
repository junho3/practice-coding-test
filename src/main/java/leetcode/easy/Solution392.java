package leetcode.easy;

public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int sIndex = 0;

        if (sLength == 0) {
            return true;
        }

        int tLength = t.length();
        int tIndex = 0;


        while (tIndex < tLength) {
            char sChar = s.charAt(sIndex);
            char tChar = t.charAt(tIndex);

            if (sChar == tChar) {
                sIndex++;

                if (sIndex == sLength) {
                    return true;
                }
            }

            tIndex++;
        }

        return false;
    }
}
