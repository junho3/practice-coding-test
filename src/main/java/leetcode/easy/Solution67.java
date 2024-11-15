package leetcode.easy;

public class Solution67 {
    public String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (aIndex >= 0 || bIndex >= 0 || carry == 1) {
            int sum = carry;

            // 마지막 Index 부터 계산
            if (aIndex >= 0) {
                sum += a.charAt(aIndex) - '0';
                aIndex--;
            }
            if (bIndex >= 0) {
                sum += b.charAt(bIndex) - '0';
                bIndex--;
            }

            carry = sum / 2;
            sb.append(sum % 2);
        }

        return sb.reverse().toString();
    }
}
