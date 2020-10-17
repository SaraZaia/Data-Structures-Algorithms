//https://www.pramp.com/challenge/r1Kw0vwG6OhK9AEGAy6L

class DecodeVariations {

	static int decodeVariations(String S) {
		return decodeVariationsHelp(S, 0,1)+decodeVariationsHelp(S,0,2);

	}

 	static int decodeVariationsHelp(String S,int index, int choice) {
    index = index+choice;
    
    if(index > S.length()) return 0;
    int num =  Integer.parseInt(S.substring(index-choice, index));
    System.out.println(num);    
    if(num <= 26 && num > 0 && index == S.length()) return 1;

    return num <= 26 && num > 0  ?decodeVariationsHelp(S, index, 1) + decodeVariationsHelp(S, index, 2) : 0;
  }

  
 
	public static void main(String[] args) {
	    System.out.println(" == " + decodeVariations("1236"));
	}
}
