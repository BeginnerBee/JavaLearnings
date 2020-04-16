package week02;

import java.util.Arrays;

public class WortGenerator {

    public static void main(String[] args) {
        char[] chars = "abcde".toCharArray();
        int len = 2;
        iterate(chars, len, new char[len], 0);
    }

    public static void iterate(char[] chars, int len, char[] build, int pos) {
        if (pos == len) {
            String word = new String(build);
            System.out.println(word);
            return;
        }

        for (int i = 0; i < chars.length ; i++) {
            build[pos] = chars[i];
            System.out.println(Arrays.toString(build) + " i" + i + "=" + chars[i] + " pos:" + pos);
            iterate(chars, len, build, pos + 1);
        }
    }
}
