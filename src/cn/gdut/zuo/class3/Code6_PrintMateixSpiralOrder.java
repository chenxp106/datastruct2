package cn.gdut.zuo.class3;

/**
 * @Desctiption TODO
 * @Date 2019/12/22/022
 **/
public class Code6_PrintMateixSpiralOrder {
//    private static void sprinOrder(int [][] matrix){
//        int a = 0;
//        int b = 0;
//        int c = matrix.length-1;
//        int d = matrix[0].length-1;
//        while (a<= c && b <= d){
//            printEdge(matrix, a++,b++, c--, d--);
//        }
//    }
//
//    private static void printEdge(int [][] matrix, int a, int b, int c, int d){
//        if (a == c){
//            for (int i = b;i <= d; i++ ){
//                System.out.print(matrix[a][i] + " ");
//            }
//        }
//        else if (b == d){
//            for (int i = a;i <= c;i++){
//                System.out.print(matrix[i][b] + " ");
//            }
//        }
//        else {
//            for (int i = b; i < d; i++){
//                System.out.print(matrix[a][i] + " ");
//            }
//            for (int i = a; i < c;i++){
//                System.out.print(matrix[i][d] + " ");
//            }
//            for (int i = d;i>b;i--){
//                System.out.print(matrix[c][i] + " ");
//            }
//            for (int i = c;i > a; i--){
//                System.out.print(matrix[i][b] + " ");
//            }
//        }
//    }
    private static void sprinOrder(int [][] matrix){
        int a = 0;
        int b = 0;
        int c = matrix.length -1 ;
        int d = matrix[0].length - 1;
        while (a <= c && b <= d){
            printEdge(matrix, a++, b++, c--, d--);
        }
    }

    private static void printEdge(int [][] matrix, int a, int b, int c ,int d){
        if (a == c){
            for (int i = b ;i < d;i++){
                System.out.print(matrix[a][i] + " ");
            }
        }
        else if (b == d){
            for (int i = a;i < c;i++){
                System.out.print(matrix[i][b]+" ");
            }
        }
        else {
            for (int i = b;i < d;i++){
                System.out.print(matrix[a][i] + " ");
            }
            for (int i = a;i < c;i++){
                System.out.print(matrix[i][d] + " ");
            }
            for (int i = d;i > b;i--){
                System.out.print(matrix[c][i] + " ");
            }
            for (int i = c;i > a;i--){
                System.out.print(matrix[i][b] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        sprinOrder(matrix);
    }
}
