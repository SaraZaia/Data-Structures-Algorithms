import java.util.Arrays;

public class Exercice8 {

    /**
     * Write an algorithm such that if an element in an M*N matrix is 0, its entire row and colmn are set to 0.
     * */
    static public int[][] indexZero(int[][] matrix) {
        int index = 0;
        int[][] result = new int[matrix.length][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    result[index][0] = i+1;
                    result[index][1] = j+1;
                }
            }
        }

        return result;
    }

    static public int[][] zeroMatrix(int[][] matrix) {
        int[][] result = indexZero(matrix);

        for (int r = 0; r < result.length; r++) {
            if (result[r][0]-1 >=0 && result[r][1]-1 >=0) {
                zeroLigne(matrix, result[r][0]-1);
                zeroColonne(matrix, result[r][1]-1);
            }

        }
        return matrix;
    }


    static public void zeroLigne(int[][] matrix, int i) {
        for (int k = 0; k < matrix[i].length; k++) {
            matrix[i][k] = 0;
        }
    }

    static public void zeroColonne(int[][] matrix, int j) {
        for (int k = 0; k < matrix.length; k++) {
            matrix[k][j] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] marix = {{1, 2, 0},
                         {11, 22, 33},
                         {111, 222, 333}};

        System.out.println("Matrix : " +Arrays.deepToString(marix));
        System.out.println("Result : " +Arrays.deepToString(zeroMatrix(marix)));
    }

}
