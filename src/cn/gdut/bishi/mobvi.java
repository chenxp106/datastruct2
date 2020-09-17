package cn.gdut.bishi;

import java.util.Scanner;

/**
 * 最大连续乘机
 */
public class mobvi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = Integer.valueOf(sc.nextLine());
        int m  = Integer.valueOf(sc.nextLine());
        int max = Integer.MIN_VALUE;
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            String[] s = sc.nextLine().trim().split(" ");
            for (int j = 0; j < m; j++){
                arr[i][j] = Integer.valueOf(s[j]);
            }
            max = Math.max(maxproduct(arr[i]), max);
        }

        for (int i = 0; i < m; i++){
            int [] t = new int[n];
            for (int j = 0; j < n; j++){
                t[j] = arr[j][i] ;
            }
            max = Math.max(maxproduct(t), max);
        }

        System.out.println(max);
    }

    private static int  maxproduct(int [] arr){
        if(arr==null||arr.length==0)
            return 0;
        int max=0,product=1;
        for(int i=0;i<arr.length;i++) {
            product=1;
            for(int j=i;j<arr.length;j++){
                product*=arr[j];
                max=Math.max(product, max);
                if(product==0)
                    break;
            }
        }
        return max;
    }

}
