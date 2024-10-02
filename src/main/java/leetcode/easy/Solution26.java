package leetcode.easy;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

        int n = nums.length;
        int i = 1;
        int prevNum = nums[0];
        int j = 1;
        // 2. nums 순회 j가 nums 길이와 같을 때까지
        while (i != n) {
            // nums[i]와 prevNum이 같은지 비교
            if (nums[i] == prevNum) {
                // 같으면 i++
                i++;
            } else {
                // 다르면 prevNum = nums[i], nums[j] = nums[i], i++, j++
                prevNum = nums[i];
                nums[j] = nums[i];
                i++;
                j++;
            }
        }

        return j;
    }
}
