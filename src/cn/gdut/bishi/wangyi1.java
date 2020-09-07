package cn.gdut.bishi;

import java.util.Scanner;

public class wangyi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] s1 = s.split(" ");
        int n = s1.length;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(s1[i]);
        }

        int pos = 0;
        for (int i = 0; i < n; i++){
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]){
                int temp_pose = arr[i] - 1;
                if (temp_pose > n - 1){
                    break;
                }
                int temp = arr[temp_pose];
                arr[temp_pose] = arr[i];
                arr[i] = temp;
            }
            while (pos < n &&arr[pos] ==pos + 1){
                pos++;
            }
        }
        System.out.println(pos+1);

    }
}
