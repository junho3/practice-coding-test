package leetcode.medium;

import java.util.HashMap;
import java.util.Set;

public class Solution75 {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> colors = map.keySet();
        int numIndex = 0;
        for (int color : colors) {
            int colorCount = map.getOrDefault(color, 0);

            while (colorCount > 0) {
                nums[numIndex] = color;
                colorCount--;
                numIndex++;
            }
        }
    }
}
