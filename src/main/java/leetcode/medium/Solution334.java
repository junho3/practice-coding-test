package leetcode.medium;

public class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        int first = Integer.MAX_VALUE; // 가장 작아야 함
        int second = Integer.MAX_VALUE; // 그 다음으로 작아야 함

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
