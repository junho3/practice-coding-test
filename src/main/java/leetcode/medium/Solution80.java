package leetcode.medium;

import java.util.HashMap;

public class Solution80 {
    public int removeDuplicates(int[] nums) {

        // 1. nums 순회 i, j 2개 포인터 필요

        // 2. Map을 만들어서 num가 몇번 되었는지 체크

        // 3. num이 0, 1번 체크 되었으면, Map을 갱신하고 패스

        // 4. num이 2번 체크되었으면 nums[j]에 할당 j++
        int n = nums.length;
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            if (map.getOrDefault(num, 0) < 2) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                nums[j] = num;
                j++;
            }
        }

        return j;
    }
}
