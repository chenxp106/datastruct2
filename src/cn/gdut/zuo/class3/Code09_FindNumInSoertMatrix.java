package cn.gdut.zuo.class3;

/**
 * @Desctiption 矩阵中查找有序的数
 * @Date 2019/12/23/023
 **/
public class Code09_FindNumInSoertMatrix {

    private static boolean  findNum(int [][] matrix, int target){
        // 从右上角到左下角找
        int i = 0;
        int j = matrix[0].length - 1;
        while ( i <= matrix.length -1 && j >= 0){
            if (target > matrix[i][j]){
                i++;
            }
            else if (target < matrix[i][j]){
                j--;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 0, 1, 2, 3, 4, 5, 6 },// 0
                { 10, 12, 13, 15, 16, 17, 18 },// 1
                { 23, 24, 25, 26, 27, 28, 29 },// 2
                { 44, 45, 46, 47, 48, 49, 50 },// 3
                { 65, 66, 67, 68, 69, 70, 71 },// 4
                { 96, 97, 98, 99, 100, 111, 122 },// 5
                { 166, 176, 186, 187, 190, 195, 200 },// 6
                { 233, 243, 321, 341, 356, 370, 380 } // 7
        };
        int K = 112;
        System.out.println(findNum(matrix, K));
    }

}
