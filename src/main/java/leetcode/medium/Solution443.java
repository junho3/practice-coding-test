package leetcode.medium;

public class Solution443 {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char ch = chars[read];
            int count = 0;

            while (read < chars.length && ch == chars[read]) {
                read++;
                count++;
            }

            chars[write] = ch;
            write++;
            if (count > 1) {
                for (char num : Integer.toString(count).toCharArray()) {
                    chars[write] = num;
                    write++;
                }
            }
        }

        return write;
    }
}
