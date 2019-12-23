package cn.gdut.zuo.class3;

/**
 * @Desctiption 旋转打印矩阵
 * @Date 2019/12/22/022
 **/
public class Code5_RotateMatrix {

    /*private void rotate(int [][] matrix){
        int a = 0;
        int b = 0;
        int c = matrix.length - 1;
        int d = matrix[0].length - 1;
        while (a < c){
            printEdge(matrix, a++, b++, c--,d--);
        }
    }

    private void printEdge(int [][] matrix, int a, int b, int c, int d){
        int times = d - b;
        for (int i = 0;i != times;i++){
            int tmp = matrix[a][b+i];
            matrix[a][b+i] = matrix[c-i][b];
            matrix[c-i][b] = matrix[c][d-i];
            matrix[c][d-i] = matrix[a+i][d];
            matrix[a+i][d]= tmp;
        }
    }*/

    private void rotate(int [][] matrix){
        int a = 0;
        int b = 0;
        int c = matrix.length - 1;
        int d = matrix[0].length - 1;
        while (b < d){
            printEdge(matrix, a++, b++, c--, d--);
        }
    }

    private void printEdge(int [][] matrix, int a, int b, int c, int d){
        int times = d - b;
        for (int i = 0 ;i < times;i++){
            // 将四个数交换
            int temp = matrix[a][b+i];
            matrix[a][b+i] = matrix[c-i][b];
            matrix[c-i][b] = matrix[c][d-i];
            matrix[c][d-i] = matrix[a+i][d];
            matrix[a+i][d] = temp;
        }
    }

    public static void main(String[] args) {
        Code5_RotateMatrix code5_rotateMatrix = new Code5_RotateMatrix();
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        code5_rotateMatrix.rotate(matrix);
        for (int i = 0; i != matrix.length; i++) {
            for (int j = 0; j != matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
