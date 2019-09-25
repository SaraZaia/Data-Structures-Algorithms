public class Exercice4 {

    /**
     * Given a String, write a function to check if it is a permutation of a plindrome. A palindrome is a word or phrase that is the same forwards
     * and backwards. A permetation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
     * EXAMPLE :
     * Input : Tact Coa
     * Output : True
     */
    public static boolean isPermutationPalindrome(String s) {

        String S = s.toLowerCase();
        int[] arrayChar = new int[256];
        int value;
        int oddChar = 0;

        for (char c : S.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                value = c;
                arrayChar[value] = arrayChar[value] + 1 ;
            }
        }

        for (char c : S.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                value = c;
                if (arrayChar[value] % 2 != 0) oddChar++;
                if (oddChar >= 2) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "Tact Coa";
        System.out.println(isPermutationPalindrome(s));
    }
}
