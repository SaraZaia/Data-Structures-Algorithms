class Solution {
    public int rotatedDigits(int N) {
        // if it contain only 0,1,2,5,6,8,9 no (3,4,7)
        // at least 2, 5, 6, 9
        
        int result = 0;
        for (int i =0; i <=N; i++) {
            if (!(Integer.toString(i).contains("3") || Integer.toString(i).contains("4") || Integer.toString(i).contains("7") )) {
                if (Integer.toString(i).contains("2") || Integer.toString(i).contains("5") ||Integer.toString(i).contains("6")||Integer.toString(i).contains("9")) {
                    
                    result++;
                }
            }
                
        }
        return result;
    }
}