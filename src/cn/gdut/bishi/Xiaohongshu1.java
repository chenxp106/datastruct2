package cn.gdut.bishi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 题目描述
    多米诺骨牌。输入一堆牌，一张牌有长和宽。找出所有长和宽都比下一个大的牌。
  输入例子
  6
  2
  100 65
  150 70
 90 56
  190 75
  95 60
  110 68

 思路：
    先根据第一维排序。然后再比较第二维，其实就是求第二维中的最长上升子序列的个数
    最长上升子序列：
        用dp[i] = max( dp[i] , dp[j]+1)
 */
public class Xiaohongshu1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.valueOf(sc.nextLine().trim());
        int n = Integer.valueOf(sc.nextLine().trim());
//            int [][] arr = {{100, 65}, {150, 70}, {90, 56}, {190, 75} , { 95, 60}, {110,68}};
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] split = s.trim().split(" ");
            arr[i][0] = Integer.valueOf(split[0]);
            arr[i][1] = Integer.valueOf(split[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
/*        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i][0] + "  " + arr[i][1]);
        }*/

        // 长度
        int[] arr1 = new int[m];
        // 将排序后的第二列中数据加入到arr1中
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i][1];
        }
        // 对第二列中的数据动态规划
        int[] dp = new int[m];
        Arrays.fill(dp, 1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if (arr1[j] < arr1[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = dp[0];
        for (int x : dp) {
            res = Math.max(x, res);
        }
        System.out.println(res);
    }
}
