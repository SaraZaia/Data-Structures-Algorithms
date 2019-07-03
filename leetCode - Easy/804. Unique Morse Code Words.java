class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> mySet = new HashSet<>();
        String str = "";
        int index = 0;
        
        for (int i = 0; i < words.length; i++) {
            str = "";
            for(int j = 0; j < words[i].length(); j++) {
                index = (char) words[i].charAt(j) - 'a';
                str += alphabet[index];
            }
            System.out.println(str);
            mySet.add(str);
        }
        return mySet.size();
    }
}