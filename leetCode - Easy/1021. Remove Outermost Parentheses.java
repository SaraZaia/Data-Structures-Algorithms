class Solution {
    public String removeOuterParentheses(String S) {
        
        Stack<String> myStack = new Stack<>();
        
        int number = 0;
        String result = "";
        int index = 1;
        
        for (int i = 0 ; i < S.length(); i++) {
            
            
            if (S.charAt(i) == '('){
                myStack.push(S.charAt(i)+"");
            }
            else if (  myStack.peek().equals("(") && S.charAt(i) == ')' ) {
                
                myStack.pop();
            }
            
            if ( myStack.isEmpty() && i!=0) {
                
                result += S.substring(index,i);
                index = i+2;

            }
        }
        return result;
    }
}