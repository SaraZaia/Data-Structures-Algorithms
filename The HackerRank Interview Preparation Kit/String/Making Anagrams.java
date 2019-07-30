import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
        int result = 0;
        int r = 0;

        Map<Character, Integer> myMap = new HashMap<>();
        
        for ( int i = 0; i < s1.length(); i++) {
            if ( myMap.containsKey(s1.charAt(i) )) {
                myMap.put(s1.charAt(i), myMap.get(s1.charAt(i)) + 1);
                result++;
            }            
            else { 
                myMap.put(s1.charAt(i), 1);
                result++;
            }
        }
        for ( int i = 0; i < s2.length(); i++) {
            if ( myMap.containsKey(s2.charAt(i) ) ){
                 myMap.put(s2.charAt(i), myMap.get(s2.charAt(i)) - 1);
            }
            else { 
                myMap.put(s2.charAt(i), -1);
                result++;
            }
        }


        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            r = r + Math.abs(entry.getValue());
        }

        return r;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
