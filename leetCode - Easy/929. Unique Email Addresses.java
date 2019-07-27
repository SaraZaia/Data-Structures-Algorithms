class Solution {
    public int numUniqueEmails(String[] emails) {
        
        // ["testemail@leetcode.com","testemail@leetcode.com","testemail@lee.tcode.com"]
        // It depend on domain name split by @
        // getting the before + => index of the first  "+"
        // removing the dot "."
        
        Set<String> myEmail = new HashSet<>();
        String[] emailSplit = null;
        
        for ( int i = 0;  i < emails.length; i++) {
            System.out.print(emails[i] + "   ");
            emailSplit = emails[i].split("@");
            myEmail.add(formatString(emailSplit[0])  + "@"+emailSplit[1] );
        }
        return myEmail.size();
        
    }
    
    public static  String formatString(String s) {
        
        int j=0;
        int indexPlus = s.length();
        char[] arrString = new char[s.length()] ;
        
        for ( int i = 0;  i < s.length(); i++) {

            if (s.charAt(i) == '+' ) {
                break;
            }
            if (s.charAt(i) != '.' ) {
                arrString[j++] = s.charAt(i);
            }
            indexPlus = j;
        }
        return new String(Arrays.copyOfRange(arrString, 0, indexPlus));
        
    } 
    
}