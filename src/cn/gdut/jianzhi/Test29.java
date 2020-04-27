package cn.gdut.jianzhi;

import java.util.ArrayList;

public class Test29 {
    public ArrayList<Integer> printMatrix(int [][] matrix){
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0){
            return res;
        }
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2){
            for (int i = c1; i <= c2; i++){
                res.add(matrix[r1][i]);
            }
            r1++;
            for (int i = r1; i <= r2; i++){
                res.add(matrix[i][c2]);
            }
            c2--;
            if (r1 <= r2){
                for (int i = c2; i >= c1; i--){
                    res.add(matrix[r2][i]);
                }
            }
            r2--;
            if (c1 <= c2){
                for (int i = r2; i >= r1; i--){
                    res.add(matrix[i][c1]);
                }
            }
            c1++;

        }
        return res;
    }

    public static void main(String[] args) {
//        int [][] maxtrix = {{1}};
        int [][] maxtrix = {{1},{2},{3},{4}};
//        int [][] maxtrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Test29 test29 = new Test29();
        ArrayList<Integer> integers = test29.printMatrix(maxtrix);
        for (Integer x : integers){
            System.out.println(x);
        }
    }
}
