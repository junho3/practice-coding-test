package leetcode.easy;

public class Solution278 {
    public int firstBadVersion(int n) {
        // 범위 1 ~ n
        int start = 1;
        int end = n;
        int result = 0;
        while (start < end) {
            // int mid = start + (end - start) / 2;
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                // 2. isBadVersion(mid): true >> 1 ~ midIndex - 1
                end = mid - 1;
                result = mid;
            } else {
                // 1. isBadVersion(mid): false >> mid + 1 ~ n
                start = mid + 1;
            }
        }

        return result;
    }

    private boolean isBadVersion(int n) {
        return true;
    }
}
