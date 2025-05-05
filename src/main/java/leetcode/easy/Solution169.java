package leetcode.easy;

public class Solution169 {
    public int majorityElement(int[] nums) {
        // 시간 복잡도 O(N)
        // 공간 복잡도 O(1)

        int majority = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (majority == nums[i]) {
                count++;
            } else {
                count--;

                // 과반수 원소는 "투표를 붙이면" 언젠가는 살아남는다는 아이디어
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
            }
        }

        return majority;
    }
}
