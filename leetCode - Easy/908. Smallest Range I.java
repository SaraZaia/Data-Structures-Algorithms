class Solution {
    public int smallestRangeI(int[] A, int k) {
        if(A.length == 1) return 0;
        if(A.length == 0) return 0;
        
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if ( A[i] < min ) min = A[i];
            if ( A[i] > max ) max = A[i];
        }
        
        min = min + k;
        max = max - k;

        
        if (min > max) return 0;
        else return max - min;
        
    }
}