package com.coding.crackingthecodinginterview.ch_01_arrays_and_strings.q1_08_zero_matrix;
import com.coding.CtCILibrary.AssortedMethods;

public class ZeroMatrix {

    private static void nullByRow(int[][] matrix, int row){
        for(int i = 0; i < matrix[0].length; i++){
            matrix[i][row] = 0;
        }
    }
    private static void nullByColumn(int[][] matrix, int col){
        for(int i = 0; i < matrix.length ; i++){
            matrix[i][col] = 0;
        }
    }
    private static void setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length ; j++){
                if (matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i =0; i < row.length; i++){
            if(row[i]){
                nullByRow(matrix, i);
            }
        }
        for(int j =0; j < col.length; j++){
            if(col[j]){
                nullByColumn(matrix, j);
            }
        }
    }

    private static boolean matricesAreEqual(int[][] m1, int[][] m2){
        if(m1.length != m2.length || m1[0].length != m2[0].length){
            return false;
        }

        for(int k = 0; k < m1.length ; k++){
            for(int j = 0; j < m1[0].length; j++){
                if (m1[k][j] != m2[k][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] cloneMatrix(int[][] matrix) {
        int[][] c = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                c[i][j] = matrix[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args){
        int nrows = 10;
        int ncols = 10;
        int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);

        AssortedMethods.printMatrix(matrix);

        setZeros(matrix);

        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
