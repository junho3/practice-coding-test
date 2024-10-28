package leetcode.medium;

public class Solution1679 {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            int iNumber = nums[i];

            if (iNumber == 0 || iNumber >= k) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                int jNumber = nums[j];
                if (jNumber == 0) {
                    continue;
                }

                if (k == iNumber + jNumber) {
                    result++;
                    nums[j] = 0;

                    break;
                }
            }
        }

        return result;
    }
}
