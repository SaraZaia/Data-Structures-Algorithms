class Solution {
    public String toLowerCase(String str) {
        
        String result = "";
        int size = 'A' - 'a';
        for (int i = 0; i < str.length(); i++)
        {
            if( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ) {
                result += (char) (str.charAt(i) - size);
            }else {
                result += str.charAt(i);
            }
        }
    return result;
    }
    
}