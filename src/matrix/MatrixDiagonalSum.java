package matrix;

public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for (int i=0 ; i <  n; i++) {
            for (int j=0; j < mat[i].length; j++){
                if (i == j || i+j == n-1 ){
                    sum += mat[i][j];
                }
            }
        }

        return sum;

    }

    public static int diagonalSumOptimal(int[][] mat) {
        int n = mat.length;

        int sum = 0;
        for (int i=0; i<n ; i++){
            sum += mat[i][i]; // primary diagonal

            if(i != n-1-i){
                sum += mat[i][n-1-i]; // secondary diagonal
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] mat = {{5}};

        //int[][] mat = { {1,2,3}, {4,5,6}, {7,8,9} } ;

        //int[][] mat = { {1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1} };

        // System.out.println(diagonalSum(mat));

        System.out.println(diagonalSumOptimal(mat));
    }
}
