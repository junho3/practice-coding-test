package leetcode.easy;

public class Solution551 {
    public boolean checkRecord(String s) {

        boolean result = true;
        int absentCount = 0;
        int lateCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                absentCount++;
                lateCount = 0;
            } else if (ch == 'L') {
                lateCount++;
            } else {
                lateCount = 0;
            }

            if (absentCount >= 2 || lateCount >= 3) {
                result = false;
                break;
            }
        }

        return result;
    }
}
