import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int result = 0;
        Integer value = 0;

        Map<Integer, Integer> myMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i<ar.length; i++)
        {
            if (myMap.get(ar[i]) == null) {
                myMap.put(ar[i], 1);
            }
            
            else if (myMap.get(ar[i]) != null) {
                myMap.put(ar[i], myMap.get(ar[i]) +1 );
            }
        }

        
        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()) {
              value = entry.getValue();
              if (value % 2 == 0)
                {
                    result = result + value/2;
                }
                else if (value > 2){
                    result = result + (value - 1) /2;
                }
            }
        return result;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
