import java.lang.*;

public class Exercice1 {
    /* If a String has all unique characters, Connot use additional data structures */

    // For ASCII codage
    static public boolean isUnique(String s) {
        int[] listChar = new int[256];
        int theChar = 0;

        for (int i = 0; i < s.length(); i++) {
            theChar = s.charAt(i);
            if(listChar[theChar] == 1) {
                return false;
            } else {
                listChar[theChar] = 1;
            }
        }
        return true;
    }

    static public boolean isUniqueSpaceFree(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }

    public static void main(String arg[]) {

        String s = "axybagkcd";
        System.out.println(isUnique(s));
        System.out.println(isUniqueSpaceFree(s));
    }
}
