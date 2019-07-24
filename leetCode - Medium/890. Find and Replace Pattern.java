class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        String c = "";
        Map<String, String> seeChar =  null;
        List<String> result = new ArrayList<String>();
        int flag = 0;
        int index = 0;
        List<String> seeCharWords = null;
        
        for (int i = 0; i < words.length; i++) {
            seeChar =  new HashMap<>();
            seeCharWords = new ArrayList<>();
            c = words[i];
            flag = 0;
            for (int j = 0; j < c.length(); j++) {
                if (!seeChar.isEmpty() && seeChar.containsKey(pattern.charAt(j)+"") ) {
                    if (!(seeChar.get(pattern.charAt(j)+"").equals(c.charAt(j)+""))) {
                        flag = 1;
                        break;
                    }
                }
                else {
                    if (!seeCharWords.contains(c.charAt(j)+"")) seeCharWords.add(c.charAt(j)+"");
                    seeChar.put(pattern.charAt(j)+"", c.charAt(j)+"");

                }
            }
            if (flag == 0 && seeCharWords.size() == seeChar.size()) result.add(c); 
            
        }
        return result;
        
    }
}