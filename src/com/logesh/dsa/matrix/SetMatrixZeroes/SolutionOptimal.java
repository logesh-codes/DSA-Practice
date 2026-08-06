package com.logesh.dsa.matrix.SetMatrixZeroes;

import java.util.Arrays;

public class SolutionOptimal {

    // Approach: Optimal
    // Time Complexity: O(n * m)
    // Space Complexity: O(1)


    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;;
        int m = matrix[0].length;

        int col0 = 1;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){

                if (matrix[i][j] == 0){

                    // mark the ith row
                    matrix[i][0] =0;
                    // mark the jth column
                    if (j != 0){
                        matrix[0][j] = 0;
                    }else {
                        col0 = 0;
                    }
                }
            }
        }

        for (int i=1; i<n; i++){
            for (int j=1; j<m; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

       if (matrix[0][0] == 0){
           for (int j=0; j<m; j++){
               matrix[0][j] = 0;
           }
       }

       if (col0 == 0){
           for (int i=0; i<n; i++){
               matrix[i][0] = 0;
           }
       }

    }

    public static void main(String[] args) {

        int[][] matrix = {{1,1,1}, {1,0,1},{1,1,1}};

        setZeroes(matrix);

        for (int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }

    }

}
