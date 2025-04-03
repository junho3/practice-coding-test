package leetcode.medium;

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                // 코인 1개 추가 시 amount에 달성하는 이전 조건
                // 목표(amount)가 dp[10]일 때 코인이 5인 경우, dp[10 - 5]가 목표(amount)를 달성하기 위한 이전 조건
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        if (dp[amount] > amount) {
            return -1;
        }

        return dp[amount];
    }
}
