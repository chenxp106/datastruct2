package cn.gdut.bishi;

import java.util.Scanner;

public class sanjiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n+1][n+1];
        arr[0][0] = 1;
        for (int i = 1; i < n + 1; i++){
            for (int j = 1; j <= i; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
