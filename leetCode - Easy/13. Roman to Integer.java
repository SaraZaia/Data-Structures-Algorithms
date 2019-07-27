class Solution {
    public int romanToInt(String s) {
        
        Map<String, Integer> mySymbol = new HashMap<>();
        mySymbol.put("I", 1);
        mySymbol.put("IV",4);        
        mySymbol.put("V", 5);
        mySymbol.put("IX", 9);
        mySymbol.put("X", 10);
        mySymbol.put("XL", 40);
        mySymbol.put("L", 50);
        mySymbol.put("XC", 90);
        mySymbol.put("C", 100);
        mySymbol.put("CD", 400);
        mySymbol.put("D", 500);
        mySymbol.put("CM", 900);
        mySymbol.put("M", 1000);
        
        int result = 0;
        String toFind = "";
        int flag = 0;
        
        for (int i = 0; i < s.length(); i++) {
            flag = 0;
            if(i+1 < s.length()) {
                toFind = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1));
                if(mySymbol.containsKey(toFind)) {
                    flag = 1;
                    result += mySymbol.get(toFind);
                    i++;
                }                
            }

             if(i < s.length() && flag== 0){
                result += mySymbol.get(s.charAt(i)+"");
            }            
        }
        return result;
    }
}