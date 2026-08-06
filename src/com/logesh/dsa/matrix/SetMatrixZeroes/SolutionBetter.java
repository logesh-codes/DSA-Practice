package com.logesh.dsa.matrix.SetMatrixZeroes;

import java.util.Arrays;

public class SolutionBetter {

    // Approach: Better (using extra space)
    // Time Complexity: O(n * m)
    // Space Complexity: O(n + m)

    public static void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == 0){
                   row[i] = 1;
                   col[j] = 1;
                }
            }

        }

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){
                if (row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
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
