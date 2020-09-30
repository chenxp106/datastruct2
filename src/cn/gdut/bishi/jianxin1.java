package cn.gdut.bishi;

import java.util.Arrays;

/**
 * 招商金科
 */
public class jianxin1 {
    public int kthSmallest (int[][] matrix, int m) {
        int row = matrix.length;
        int col = matrix[0].length;
        int l = matrix[0][0];
        int h = matrix[row-1][col-1];

        while (l < h){
            int mid = l + (h - l) / 2;
            int cnt = 0;
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col && matrix[i][j] <= mid; j++){
                    cnt++;
                }

            }
            if (cnt < m){
                l = mid+1;
            }
            else {
                h = mid - 1;
            }
        }
        return l;
    }
}
