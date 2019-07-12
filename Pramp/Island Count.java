import java.io.*;
import java.util.*;

class Solution {

  static int getNumberOfIslands(int[][] binaryMatrix) {
    // your code goes here
    int solution = 0;
    
    Stack<Integer> myStack = new Stack<>();
    
    for (int i = 0; i < binaryMatrix.length; i++) {
      for (int j = 0; j <binaryMatrix[i].length; j++) {
        if (binaryMatrix[i][j] == 1) {
          solution += dfs(binaryMatrix, i, j);
        }
      }
      System.out.println(Arrays.deepToString(binaryMatrix));
    }
    return solution;
  }
  
  static public int dfs(int[][] binaryMatrix, int i, int j) {
    if(i < 0 || j < 0 || i >= binaryMatrix.length || j>= binaryMatrix[0].length || binaryMatrix[i][j] == 0) {
      return 0;
    }
    binaryMatrix[i][j] = 0;
    dfs(binaryMatrix, i+1, j);
    dfs(binaryMatrix, i, j+1);
    dfs(binaryMatrix, i-1, j);
    dfs(binaryMatrix, i, j-1);
    
    return 1;
  }

  public static void main(String[] args) {
    
  }

}