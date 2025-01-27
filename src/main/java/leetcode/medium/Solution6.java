package leetcode.medium;

public class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        // numRows에 따른 증가값
        int increment = (numRows - 1) * 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += increment) {
                sb.append(s.charAt(j));
                // numRows 첫번째와 마지막을 제외한 중간에서는 +2 간격으로 추가
                if (i > 0 && i < numRows - 1 && j + increment - (i * 2) < s.length()) {
                    sb.append(s.charAt(j + increment - (i * 2)));
                }
            }
        }

        return sb.toString();
    }
}
