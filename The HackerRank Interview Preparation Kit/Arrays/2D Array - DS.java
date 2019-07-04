import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = -81;   // For negative cases the worst case is all the 9 cells having -9 as a value
        Node myNode = null;
        int[][] subArr = new int [3][3];
        for (int k=0; k< 4; k++) { // Do the traversal vertically
            for (int i =0; i < 4; i++) { // traverse the 4 horizontals cases 
                for (int j =0; j < 3; j++) {
                    subArr[j] = Arrays.copyOfRange(arr[j + k ], i, i+3);  // the line to 
                                                                  //copy 123, 234, 345..
                }
                System.out.println(Arrays.deepToString(subArr)); // to print all

                myNode = new Node(subArr);
                if (myNode.getSomme() > max) max = myNode.getSomme();

            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

class Node {
    int[][] houGlass;
    int somme;

    Node(int[][] houGlass) {
        this.houGlass =  new int[3][3];
        this.houGlass = houGlass;
    }

    int getSomme() {
        int sum = 0;
        for (int i = 0; i < 3; i = i+2) {
            for (int j = 0; j < 3; j++) {
                sum += houGlass[i][j];

            }
        }
        return sum + houGlass[1][1];
    }


}