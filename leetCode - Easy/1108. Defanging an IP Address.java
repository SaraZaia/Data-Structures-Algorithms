class Solution {
    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder(20);

        for (int i = 0; i < address.length(); i++) { 
            if ((address.charAt(i)+"").equals(".")) {
                res.append("[.]");
            }else {
                res.append(address.charAt(i));
            }
        }
        return res.toString();
    }
}