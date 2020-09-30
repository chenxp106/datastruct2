package cn.gdut.bishi;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class weizhong1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(" ");
        int n = Integer.valueOf(s[0]);
        int q = Integer.valueOf(s[1]);

        int [] arr = new int[n];
        String[] s2 = sc.nextLine().trim().split(" ");
        for (int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(s2[i]);
        }
        int [] inp = new int[q];
        for (int i = 0; i < q; i++){
            String s3 = sc.nextLine().trim();
            inp[i] = Integer.valueOf(s3);
        }

        Arrays.sort(arr);

        for (int i = 0; i < q; i++){
            int flag = Integer.MAX_VALUE;

            int cur = inp[i];
            int l = arr[0];
            int h = arr[n-1];
            while (l < h){
                int mid = l + (h - l) / 2;
                if (arr[mid] == cur){
                    flag = cur;
                    break;
                }
                else if (arr[mid] > cur){
                    h = mid - 1;
                }
                else {
                    l = mid+1;
                }
            }
            int res = Math.min(arr[l], flag);
            System.out.println(res);
        }
    }
}
