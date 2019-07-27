class Solution {
    public String longestPalindrome(String s) {
        
        if (s.length() ==0 ) return "";
        if (s.length() ==1 ) return s;
        
        
        int max = 0;
        int MAX = 0;
        int START = 0;
        int END = 0;
        int j = 0;
        
        int Start = 0;
        int End = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (MAX < max) {
                MAX = max;
                START = Start;
                END = End;
            }
            j = 1;
            
            while (i-j+1 >= 0 && i+j < s.length() && s.charAt(i-j+1) == s.charAt(i+j)) {                
                max = 2*j;
               Start  = i - j +1;
               End = i + j ;   
                j++;
                
            }
            
            if (MAX < max) {
                MAX = max;
                START = Start;
                END = End;
            }
            j = 1;
            while (i-j >= 0 && i+j < s.length() && s.charAt(i-j) == s.charAt(i+j)) {
                max = 2 * j + 1 ;
                    Start  = i - j;
                    End = i + j;
                j++;
                                       
            }
        }
        return s.substring(START,END+1);
        
    }
}