package cn.gdut.bishi;

import java.util.Scanner;

public class tengxun1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
//        String s = sc.nextLine();
        for (int i = 0; i < n; i++){
//            String[] s1 = s.trim().split(" ");
            arr1[i] = sc.nextInt();
        }


        int m = sc.nextInt();
        int [] arr2 = new int[m];
        String ss = sc.nextLine();

        for (int i = 0; i < m; i++){
            String[] s2 = ss.trim().split(" ");
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0;

        String res = "";
        while (i < n && j < m){
            if (arr1[i] == arr2[j]){
                res += arr1[i] + " ";
                i++;
                j++;

            }
            else if (arr1[i] > arr2[j]){
                i++;
            }
            else {
                j++;
            }
        }

        System.out.println(res.trim());

    }
}
