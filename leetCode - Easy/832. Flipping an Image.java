class Solution {
    public int[][] flipAndInvertImage(int[][] A) {        
        for ( int i = 0; i < A[0].length ; i++) {
                    int[] ligne = new int[A.length];
            for ( int j = 0; j < A[0].length ; j++) {
                if (A[i][A[0].length-1-j]== 1) ligne[j] = 0;
                if (A[i][A[0].length-1-j]== 0) ligne[j] = 1;    
            }
            A[i] = ligne;      
        }
        return A;
    }
}