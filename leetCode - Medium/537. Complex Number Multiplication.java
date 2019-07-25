class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] firstnumber = a.split("\\+");
        String[] secondnumber = b.split("\\+");
        firstnumber[1] = firstnumber[1].substring(0,firstnumber[1].length()-1);
        secondnumber[1] = secondnumber[1].substring(0,secondnumber[1].length()-1);
        String[] result = new String[2];
        int aa = Integer.parseInt(firstnumber[0])*Integer.parseInt(secondnumber[0]) - Integer.parseInt(firstnumber[1])*Integer.parseInt(secondnumber[1]) ;
        int bb = Integer.parseInt(firstnumber[0])*Integer.parseInt(secondnumber[1]) + Integer.parseInt(firstnumber[1])*Integer.parseInt(secondnumber[0]);
        return aa + "+" + bb +"i";
    }
}