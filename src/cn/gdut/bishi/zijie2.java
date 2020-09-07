package cn.gdut.bishi;

import java.util.Map;
import java.util.Scanner;

public class zijie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine().trim());
        String s = sc.nextLine().trim();
        String[] s1 = s.split(" ");
        int len = s1.length;
        int [] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = Integer.valueOf(s1[i]);
        }

        int [] temp = new int[N];
        temp[0] = 0;
        temp[N-1] = 0;
        int max = temp[0];
        int left = 0;
        int right = 0;
        for (int i = 1; i < N -1; i++){
            for (int j = i-1 ; j >= 0; j--){
                if (arr[j] > arr[i]){
                    left = j + 1;
                    break;
                }
            }
            for(int j = i + 1 ; j<N;j++){
                if (arr[j] > arr[i]){
                    right = j + 1;
                    break;
                }
            }
            max = Math.max(left* right, max);
        }
        System.out.println(max);

    }
}
