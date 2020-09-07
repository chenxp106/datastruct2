package cn.gdut.bishi;

import java.util.Scanner;

public class wangyi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] s1 = s.split(" ");
        int n = s1.length;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(s1[i]);
        }

        boolean res = dfs(arr, 0);
        System.out.println(res ? "1" : "0");


    }

    private static boolean dfs(int [] arr, int index){
        if (index >= arr.length){
            return true;
        }
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left >= arr.length){
            return true;
        }
        if ( arr[index] <= arr[left] ){
            return false;
        }

        if ( !(right < arr.length && arr[index] > arr[right] )){
            return false;
        }
        return dfs(arr, left) && dfs(arr, right);

    }
}
