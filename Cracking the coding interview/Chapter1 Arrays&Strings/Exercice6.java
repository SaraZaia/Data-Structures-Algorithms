import java.util.*;

public class Exercice6 {

    /**
     * Implement a method to perform basic dtring compression using the counts of repeated characters.
     * For example the String "aabcccccaaa" would become "a2b1c5a3".
     * If the "compressed" string would not bbecome smaller than the original string, your method should return the original string.
     * You can assume the string has only uppercase and lowercase letters (a-z)
     */
    public static String sCompress(String s) {
        StringBuilder build = new StringBuilder();
        int count = 0;
        char value = '0';
        String result;

        for (char c : s.toCharArray()) {
            if ( c != value) {
                if (value != '0') {
                    build.append(value);
                    build.append(count);
                }
                value = c;
                count = 1;
            } else {
                count++;
            }
        }
        build.append(value);
        build.append(count);
        result = build.toString();
        return result.length() <= s.length() ? result : s;
    }


    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println(sCompress(s));
    }
}
