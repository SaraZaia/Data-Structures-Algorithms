class Solution {
    public int maxWidthRamp(int[] tab) {
		int N = tab.length;
		int j = 0;
		int max = 0;
		int a = 0;
		
		for (int i = 0; i < N; i++) {
			j = N-1;
			//System.out.println("list1 : " + tab[i] + " index : " + i );
			
			while (j > 0 && (tab[j] < tab[i] &&  j-i > max)) {
				 a = j-i;
				//System.out.println("                   list : " + tab[j] + " index : " + j  + "=====" + a);

				j--; 
			}
			if (tab[j] >= tab[i] && j-i > max ) {
				 max = j-i;	
					//System.out.println("                   Max = " + max);

			}			
		}
		//System.out.println("Max = " + max);

		return max;		
	}
}