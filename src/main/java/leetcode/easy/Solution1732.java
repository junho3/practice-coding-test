package leetcode.easy;

public class Solution1732 {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int defference = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            defference = defference + gain[i];

            if (defference > result) {
                result = defference;
            }
        }

        return result;
    }
}
