import javax.swing.*;

public class Exercice2 {

    /**
     * Given two Strings, write a method to decidee if one is a permutation of the other
     * */
    static public boolean isPermutation(String s1, String s2) {

        if (s1.length()!= s2.length()) return false;

        int sum1 = 0;
        int sum2 = 0;
        int[] chars = new int[256];

        int value = 0;

        for (int i = 0; i < s1.length(); i++) {
            value = s1.charAt(i);
            chars[value] = chars[value]++;
            sum1 = sum1 + value;
        }

        for (int i = 0; i < s1.length(); i++) {
            value = s1.charAt(i);
            chars[value] = chars[value]--;
            if (chars[value] < 0) return false;
            sum2 = sum2 + value;
        }

        if (sum1 != sum2) return false;
        return true;
    }

    public static void main(String[] args) {

        String s1 = " Dogo";
        String s2 = "godo ";
        System.out.println(isPermutation(s1,s2));
    }
}
