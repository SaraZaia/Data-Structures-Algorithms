public class Exercice5 {


    /**
     * There are tree types of edits that can be performed on strings:
     * insert, remove or replace a character. Given two strings, write a function to check if they are One edit (or Zero Edits)
     * */
    static String minString(String a, String b) {
        if (a.length() <= b.length()) return a;
        else return b;
    }
    static String maxString(String a, String b) {
        if (a.length() >= b.length()) return a;
        else return b;
    }
    static public boolean isEdit(String a, String b) {
        if (a.length() - b.length() < -1 || a.length() - b.length() > 1) return false;

        String max = maxString(a, b);
        String min = minString(a,b);
        int diff = 0;

        for (int i = 0, j= 0; i < max.length(); i++, j++) {
            if (diff == 0 && i == min.length()) return true;
            if (min.charAt(j) != max.charAt(i)) {
                    diff++;
                if (min.length() != max.length()) {
                    j--;
                }
            }
            if (diff > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isEdit("pale", "ple"));
    }
}
