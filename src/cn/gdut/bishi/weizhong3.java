package cn.gdut.bishi;

import java.util.Scanner;

public class weizhong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        for (int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        int res = 0;
        for (int i = 1; i < n+1; i++){
            for (int j = i+1; j < n+1; j++){
                for (int k = j+1; k < n+1;k++){
                    if (arr[i] <= arr[j] && arr[j]<= arr[k]){
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
