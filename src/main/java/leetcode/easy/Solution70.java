package leetcode.easy;

public class Solution70 {
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }

        int[] ways = new int[n];
        ways[0] = 1;
        ways[1] = 2;

        for (int i = 2; i < n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n - 1];
    }
}

// 계단 1개
// 1 >> 1개

// 계단 2개
// 1 + 1 | 2 >> 2개

// 계단 3개
// 1 + 2 | 2 + 1 | 1 + 1 + 1 >> 3개

// 계단 4개
// 1 + 1 + 1 + 1 | 1 + 1 + 2 | 1 + 2 + 1 | 2 + 1 + 1 | 2 + 2 >> 5개
