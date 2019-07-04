import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        
        long m = n-(s.length() * (n/s.length())); // the rest of n/s.length(): division
        long mResult = 0;
        long nResult = 0;
        
        String str = "";
        if (s.length() >= n) {
            // Repeated caracter
            for (int i = 0; i < n; i++) {
                if ( (s.charAt(i)+"").equals("a")) nResult++;
            }
 
            return nResult;
        }
        else {
// Repeated caracter in s * n/s.length +Repeated caracter in s.subtring(0,n-n/s.length)
        for (int i = 0; i < s.length(); i++) {
                if ( (s.charAt(i)+"").equals("a")) {
                    nResult++;
                    if (i < m) mResult++;
                }  
            }
            return nResult * (n/s.length()) + mResult;

        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
