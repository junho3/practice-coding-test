package neetcode.blind75.twopointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length() -1;

        boolean result = true;
        while (startIndex < endIndex) {
            char startChar = s.charAt(startIndex);
            char endChar = s.charAt(endIndex);

            if (!Character.isLetterOrDigit(startChar)) {
                startIndex++;
            } else if (!Character.isLetterOrDigit(endChar)) {
                endIndex--;
            } else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    result = false;
                    break;
                }
                startIndex++;
                endIndex--;
            }
        }

        return result;
    }
}
