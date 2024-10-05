package leetcode.medium;

public class Solution12 {
    public String intToRoman(int num) {
//        Input: num = 3749
//        Output: "MMMDCCXLIX"

        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            int number = numbers[i];

            if (num >= number) {
                num = num - number;
                sb.append(romans[i]);
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
