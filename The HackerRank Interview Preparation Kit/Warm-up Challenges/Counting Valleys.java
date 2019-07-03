import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        Stack<String> myStack = new Stack<>();
        char UP = 'U';
        char Down = 'D';

        int nbrVally = 0;

        for (int i = 0 ; i < s.length(); i++) {
            if (myStack.isEmpty() || myStack.peek().equals(s.charAt(i)+"")) 
            {
                myStack.push(s.charAt(i)+"");
            }
            else if (!myStack.peek().equals(s.charAt(i)+"")) {
                if (myStack.size() == 1 && myStack.peek().equals("D")) { nbrVally++;}
                myStack.pop();

            }
        }
        return nbrVally;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
