package cn.gdut.bishi;

import java.util.Scanner;

/**
 * @ClassName jingdong2
 * @Desctiption TODO
 * @Date 2020/8/27 20:10
 */
public class jingdong2 {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = Integer.parseInt(in.nextLine());
            int[][] table = new int[n][2*n-1];
            for(int i=0; i<n; i++){
                String[] line = in.nextLine().trim().split(" ");
                for (int j=0; j<line.length; j++) {
                    table[i][j] = Integer.parseInt(line[j]);
                }
            }

            deepfirst(table, 0, 0, 0);
            System.out.println(max);
        }
    }

    private static void deepfirst(int[][] table, int i, int j, int sum){
        if (i>=table.length || j<0 || j>2*((i+1)-1)){
            return;
        }
        sum += table[i][j];
        max = Math.max(max, sum);
        deepfirst(table, i+1, j+1-1, sum);
        deepfirst(table, i+1, j+1, sum);
        deepfirst(table, i+1, j+1+1, sum);
    }
}
