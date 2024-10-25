package leetcode.easy;

public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        if (length == 1) {
            if (n == 0) {
                return true;
            }

            if (flowerbed[0] == 0 && n == 1) {
                return true;
            }

            return false;
        }

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n = n - 1;
                }
            } else if (i == length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n = n - 1;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n = n - 1;
                }
            }
        }

        return n > 0 ? false : true;
    }
}
