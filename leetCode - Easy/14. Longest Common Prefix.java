class Solution {
    public String longestCommonPrefix(String[] strs) {      
        if ( strs.length == 0) return "";
        String result = strs[0];
        
        for (int i= 1; i < strs.length; i++) {
            result = comparePrefex(result, strs[i]);            
            if (result.length()==0) return "";
        }
        return result;
    }
    
    public static String comparePrefex(String s1, String s2) {
        int index = Math.min(s1.length(), s2.length());
        for( int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if ( s1.charAt(i) != s2.charAt(i)) {
                index = i;
                break;
            }
        }
        return s1.substring(0, index);
        
    }
}