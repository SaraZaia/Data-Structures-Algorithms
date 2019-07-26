class Solution {
    public String customSortString(String S, String T) {
        
        
        String result = "";
        int k = 0;
        
        Map<String, Integer> myMap = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (S.indexOf(s1.charAt(0)) < S.indexOf(s2.charAt(0))){
                    return -1;

                }
                return 1;
            } 
        });
            
        for (int i = 0; i <T.length(); i++) {
            if (!myMap.containsKey(T.charAt(i)+"")) {
                myMap.put(T.charAt(i)+"", 1);
            } else {
                myMap.put(T.charAt(i)+"", myMap.get(T.charAt(i)+"")+1);
            }  
        }
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            k = entry.getValue();
            while (k > 0 ) {
                result += entry.getKey();
                k--;
            }
        }
        return result;
    }
} 