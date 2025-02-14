package leetcode.medium;

public class Solution1899 {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] result = new int[target.length];

        for (int[] triplet : triplets) {
            // target의 숫자보다 큰 숫자가 포함된 조합은 패스
            if (triplet[0] > target[0] || triplet[1] > target[1] || triplet[2] > target[2]) {
                continue;
            }

            for (int i = 0; i < triplet.length; i++) {
                if (triplet[i] == target[i]) {
                    result[i] = triplet[i];
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != target[i]) {
                return false;
            }
        }

        return true;
    }
}
