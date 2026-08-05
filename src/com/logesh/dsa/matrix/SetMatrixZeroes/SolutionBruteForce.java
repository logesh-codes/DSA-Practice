package com.logesh.dsa.matrix.SetMatrixZeroes;

import java.util.Arrays;

public class SolutionBruteForce {

    // Approach: Brute Force
    // Time Complexity: O(n^3)
    // Space Complexity: O(1)

    public static void setZeroes(int[][] matrix) {

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){

                if (matrix[i][j] == 0){
                    markRow(matrix,i);
                    markColumn(matrix,j);
                }

            }
        }

        makeToZeros(matrix);

    }

    public static void markRow(int[][] matrix, int i){

        for (int j=0; j< matrix[0].length; j++){
            if (matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }

    }

    public static void markColumn(int[][] matrix, int j){

        for (int i=0; i< matrix.length; i++){
            if (matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }

    }

    public static void makeToZeros(int[][] matrix){

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){
                if (matrix[i][j] == -1){
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
