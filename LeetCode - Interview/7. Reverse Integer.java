class Solution {
    public int reverse(int x) {
        StringBuilder entier = new StringBuilder();
        int k = 0;
        if ( x < 0) 
        {
            entier.append("-");
             k = 1;
        }
        
        for (int i = (x+"").length() - 1 ; i >= k; i--) {
            entier.append((x+"").charAt(i)+"");
        }
        try {
            return Integer.parseInt(entier.toString());
            
        }
        catch(Exception e) {
            return 0;
        }     
        
    }
}