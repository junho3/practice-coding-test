package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
//        Input: nums = [-1,0,1,2,-1,-4] >> [-4,-1,-1,0,1,2]
//        Output: [[-1,-1,2],[-1,0,1]]

        // 1. nums 정렬

        // i = 0, j = 1, k = nums.length;

        // i + j + k > 0 : k--
        // i + j + k < 0 : j++
        // i + j + k == 0 : add

        // 중복을 제거하기 위한 조건 필터링

        Arrays.sort(nums);

        Map<String, List<Integer>> result = new HashMap();

        for (int i = 0; i < nums.length - 2; i++) {
            int iNum = nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            if (i > 0 && nums[i - 1] == iNum) {
                continue;
            }

            while (j < k) {
                int jNum = nums[j];
                int kNum = nums[k];

                if ((iNum + jNum + kNum) < 0) {
                    j++;
                } else if ((iNum + jNum + kNum) > 0) {
                    k--;
                } else {
                    String key = iNum + "#" + jNum + "#" + kNum;
                    if (result.get(key) == null) {
                        result.put(key, List.of(iNum, jNum, kNum));
                    }

                    j++;
                }
            }
        }

        return result.values().stream().toList();
    }
}
