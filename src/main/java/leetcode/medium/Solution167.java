package leetcode.medium;

public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
//        Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
        // 18
        // [2, 3]

        // 1. n = 0, m = n + 1로 순회
        int i = 0;
        int j = numbers.length - 1;
        int[] result = new int[2];

        while (i < j) {
            int iNumber = numbers[i];
            int jNumber = numbers[j];

            if ((iNumber + jNumber) > target) {
                j--;
            } else if ((iNumber + jNumber) < target) {
                i++;
            } else {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            }
        }

        return result;
    }
}
