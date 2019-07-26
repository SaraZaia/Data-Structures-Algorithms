import java.io.*;
import java.util.*;

class Solution {
  
  static int[] arrayOfArrayProducts(int[] arr) {
    // your code goes here
    /*    
        arr = [2, 7, 3, 4]
        arrLeft = [1, 2, 2*7, 2*7*3] 
        arrRight = [7*3*4, 3*4, 4, 1]
	*/
    
       int[] arrRight = new int[arr.length];
       int[] arrLeft = new int[arr.length];
    
        if (arr.length == 0 || arr.length == 1  ) return new int[]{};
       for (int i = 0; i < arr.length; i++) {
          arrRight[i] = 1;
          arrLeft[i] = 1;
       }
    
       for (int i = 0; i < arr.length-1; i++) {
         
         arrLeft[i+1] =arrLeft[i] *arr[i]; 
         arrRight[arr.length-1 - i -1]  = arrRight[arr.length-1 - i] * arr[arr.length-1 - i];
         
       }
    
       for (int i = 0; i < arr.length; i++) {
         arr[i] = arrRight[i] * arrLeft[i];
         
       }
    return arr;

  }

  public static void main(String[] args) {
    

  }

}