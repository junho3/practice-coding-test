package leetcode.easy;

public class Solution541 {
    public String reverseStr(String s, int k) {

        // 1. s 순회

        // 2. 0 ~ k - 1 까지 별도의 문자열을 저장하고 역순으로 배치

        // 3. k ~ 2k - 1 까지는 정상 배치

        // 4. 2k ~ 3k - 1 까지 역순 배치

        StringBuilder sb = new StringBuilder();
        boolean isReverse = true;
        int n = s.length() - 1;
        int index = 0;
        while (index <= n) {
            int start = index;
            int end = Math.min(start + k - 1, n);

            if (isReverse) {
                while (end >= start) {
                    sb.append(s.charAt(end));
                    end--;
                }

                isReverse = false;
            } else {
                while (start <= end) {
                    sb.append(s.charAt(start));
                    start++;
                }

                isReverse = true;
            }

            index = index + k;
        }

        return sb.toString();
    }
}
