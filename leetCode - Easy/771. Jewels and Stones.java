class Solution {
    public int numJewelsInStones(String J, String S) {		
        int somme =0;
		Map<String, Integer> mySet = new TreeMap<String, Integer>();
	
		for (int i = 0; i < S.length(); i++) {
			mySet.computeIfPresent(S.charAt(i)+ "", (k,v)-> v+1);
			mySet.putIfAbsent(S.charAt(i)+ "", 1);
		}
		
		for (int i = 0; i < J.length(); i++) {
			if (mySet.get(J.charAt(i)+"") != null) {
				somme = somme + mySet.get(J.charAt(i)+"");				
			}
		}		
		return somme;
    }
}