package cn.gdut.bishi;

public class juren1 {

    public static void main(String[] args) {
        int [][] a = {{0,1,2},{3,4,5},{6,7,8}};

        int [][] b = RotateMatrix(a);
        for (int [] x : b){
            for (int y : x){
                System.out.print(y);
            }
            System.out.println();
        }

    }
    public static int[][] RotateMatrix (int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int [][] b = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int  j = 0; j < n; j++){
                b[n - 1 - j][i] = matrix[i][j];
            }
        }
        return b;
    }

}
