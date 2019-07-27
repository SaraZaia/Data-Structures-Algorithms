class Solution {
    /*
    Strating from the first and a adding in map (char, index) + checking
    until we find the repeated value 
    and we start again from next index 
    "pwwkew"
    [pw,wke]
    */
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        if (s.length()==1) return 1;
        int max = 0;
        int start = 0;
        int index = 0;
        Map<Character, Integer> myChar = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if ((myChar.containsKey(s.charAt(i)) && myChar.get(s.charAt(i)) >= index )) {
                if ( max < start) max = start;
                //start -= myChar.get(s.charAt(i))  ;
                index = myChar.get(s.charAt(i)) + 1;
                start = i - index + 1;
                myChar.replace(s.charAt(i), i);

            } else {
                myChar.put(s.charAt(i), i);
                start++;
            }
        }
        if (max < start) max = start;
        return max;
    }
}