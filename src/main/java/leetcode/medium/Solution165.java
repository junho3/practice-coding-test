package leetcode.medium;

public class Solution165 {
    public int compareVersion(String version1, String version2) {
        // 1. .으로 스플릿
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");

        // 2. length가 긴 것을 기준으로 순회
        // 3. 순회하면서 숫자 검증
        int length = Math.max(split1.length, split2.length);
        for (int i = 0; i < length; i++) {
            int num1 = split1.length > i ? Integer.parseInt(split1[i]) : 0;
            int num2 = split2.length > i ? Integer.parseInt(split2[i]) : 0;

            if (num1 > num2) {
                return 1;
            }

            if (num2 > num1) {
                return -1;
            }
        }

        return 0;
    }
}
