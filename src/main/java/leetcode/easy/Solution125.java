package leetcode.easy;

public class Solution125 {

    public boolean isPalindrome(String s) {
        // "A man, a plan, a canal: Panama"
        // "amanaplanacanalpanama" is a palindrome.

        // 1. 문자열 탐색
        boolean result = true;
        int startIndex = 0;
        int endIndex = s.length() - 1;
        while (startIndex < endIndex) {
            char ch1 = Character.toLowerCase(s.charAt(startIndex));
            char ch2 = Character.toLowerCase(s.charAt(endIndex));

            if (!Character.isLetterOrDigit(ch1) || ch1 == ' ') {
                startIndex++;
                continue;
            }

            if (!Character.isLetterOrDigit(ch2) || ch2 == ' ') {
                endIndex--;
                continue;
            }

            if (ch1 != ch2) {
                result = false;
                break;
            }

            startIndex++;
            endIndex--;
        }

        // 2. 문자열의 시작 Index는 증가시키고, 문자열의 끝 Index는 감소시키면서 비교

        // 3. 영문과 숫자만 체크하고 공백과 특수문제는 건너 뜀

        return result;
    }
}
