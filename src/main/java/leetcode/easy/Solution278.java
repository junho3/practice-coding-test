package leetcode.easy;

public class Solution278 {
    public int firstBadVersion(int n) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        int left = 1;
        int right = n;
        int badVersion = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                badVersion = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return badVersion;
    }

    private boolean isBadVersion(int n) {
        return true;
    }
}
