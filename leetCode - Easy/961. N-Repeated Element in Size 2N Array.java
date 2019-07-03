import java.util.*;

class Solution {
    
    static public int repeatedNTimes(int[] list) 	{
		int N= list.length/2;
		int A = N-1;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < list.length; i++) {
			map.compute(list[i], (k,v) -> (v == null) ? 1 : (v+1));
			
			if( map.get(list[i]) > A)
			{
				return list[i];
			}
			
		}
		return 0;
	}
}