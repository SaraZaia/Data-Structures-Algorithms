class Solution {
    public boolean checkRecord(String s) {
        
        int pAbs = 0;
        int pLate = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='A') {
                pAbs++;
                if(pAbs >= 2) return false;
            }
            if (s.charAt(i) == 'L') {
                pLate++;
                if (pLate >= 3) return false;
            } else if (pLate != 0) {
                pLate = 0;
            }
            
        }
        return true;
        
    }
}