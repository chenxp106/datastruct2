package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.List;

public class Test29 {
    public ArrayList<Integer> printMatrix(int [][] matrix){

        ArrayList<Integer> res = new ArrayList<>();
        //行和列数
        int r1 = 0, r2 = matrix.length-1;
        int c1 = 0, c2 = matrix[0].length-1;

        while (r1 <= r2 && c1 <= c2){
            for (int i = c1; i <= c2; i++){
                res.add(matrix[r1][i]);
            }
            for (int i = r1 + 1; i <= r2; i++){
                res.add(matrix[i][c2]);
            }
            if (r1 != r2){
                for (int i = c2 - 1; i >= c1; i--){
                    res.add(matrix[r2][i]);
                }
            }
            if (c1 != c2){
                for (int i = r2-1; i> r1;i--){
                    res.add(matrix[i][c1]);
                }
            }
            r1++;r2--;c1++;c2--;
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] maxtrix = {{1}};
        Test29 test29 = new Test29();
        test29.printMatrix(maxtrix);
    }
}
