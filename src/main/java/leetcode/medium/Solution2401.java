package leetcode.medium;

public class Solution2401 {
    public int longestNiceSubarray(int[] nums) {
        // 시간 복잡도 O(N)
        // 공간 복잡도 O(1)

        int result = 0;
        int used = 0;

        int left = 0;
        int right = 0;
        while (right < nums.length) {
            int num = nums[right];

            // TODO 비트 연산은 정확히 모르겠고, 슬라이딩 윈도우 기본 구현을 위한 풀이

            // 현재 nums[right]와 겹치는 비트가 있으면 왼쪽에서 제거
            while ((used & num) != 0) {
                used ^= nums[left]; // left의 비트를 빼줌
                left++;
            }

            used |= num; // 비트 추가
            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }
}
