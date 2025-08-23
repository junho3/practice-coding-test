package leetcode.medium;

public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // 시간복잡도 O(N)
        // 공간복잡도 O(1)

        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            total = total + gas[i] - cost[i];
            tank = tank + gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (total < 0) {
            return -1;
        }

        return start;
    }

    public int canCompleteCircuit_BruteForce(int[] gas, int[] cost) {
        // 시간복잡도 O(N^2)
        // 공간복잡도 O(1)

        int length = gas.length;
        for (int start = 0; start < length; start++) {
            int step = 0;
            int tank = 0;

            while (step < length) {
                int i = (start + step) % length;
                tank = tank + gas[i] - cost[i];

                if (tank < 0) {
                    break;
                }
                step++;
            }

            if (step == length) {
                return start;
            }
        }

        return -1;
    }
}
