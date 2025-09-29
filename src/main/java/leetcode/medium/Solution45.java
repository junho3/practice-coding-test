package leetcode.medium;

public class Solution45 {

    public int jump(int[] nums) {
        // 시간 복잡도 O(n)
        // 공간 복잡도 O(1)

        int count = 0; // 사용한 점프 수 (층 수)
        int currentMax = 0; // 현재 층의 오른쪽 끝(현 점프 수로 도달 가능한 끝)
        int max = 0; // 다음 점프 한 번으로 도달 가능한 최대 끝(다음 층 경계)

        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);

            if (i == currentMax) {
                currentMax = max;
                count++;

                if (currentMax >= nums.length - 1) {
                    break;
                }
            }
        }

        return count;
    }

    private static int MIN = Integer.MAX_VALUE;

    public int jumpDFS(int[] nums) {
        // 시간 복잡도 O(2^N)
        // 공간 복잡도 O(N)
        dfs(nums, 0, 0);

        return MIN;
    }

    private void dfs(int[] nums, int position, int count) {
        if (position >= nums.length - 1) {
            MIN = Math.min(MIN, count);
            return;
        }

        for (int i = 1; i <= nums[position]; i++) {
            int newPosition = position + i;
            dfs(nums, newPosition, count + 1);
        }
    }
}
