public class Exercice3 {


    /**
     * URLify :  write  a methode to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end
     * to hold the additional characters, and that you are given the "true" length of the string. (Note: if implementing in JAVA, please use a
     * character array so that you can perform this operation in place.)
     * EXAMPLE:
     * Input : Mr John Smith, 13
     * Output: Mr%20John%20Smith
     */
    static public String urlify(char[] sentence, int l) {
        for (int i = sentence.length-1; i >0 && l >0; i--) {
            l--;
            if (sentence[l] != ' ') {
                sentence[i] = sentence[l];
            }
            else {
                sentence[i--] = '0';
                sentence[i--] = '2';
                sentence[i] = '%';
            }
        }
        StringBuilder build = new StringBuilder();
        for (char c : sentence) {
            build.append(c);
        }
        return build.toString();
    }

    /* */
    public static char[] onChars(String sentence) {
        int n = 0;
        for ( char c : sentence.toCharArray()) {
            if ( c == ' ') n++;
        }
        int l = sentence.length() + 2 * n;
        char[] sentenceChar = new char[l];
        for (int i = 0; i < sentence.length(); i++) {
            sentenceChar[i] = sentence.charAt(i);
        }
        return sentenceChar;
    }


    public static void main(String[] args) {
        String s = "Mr John Smith";
        char[] sentence = onChars(s);
        System.out.println(s);
        System.out.println(urlify(sentence,s.length()));

    }
}
