package cn.gdut.bishi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pinganq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String trim = sc.nextLine().trim();
        String[] s = trim.split(" ");
        int n = s.length;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(s[i]);
        }

        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        for (int i = n-1; i > 0; i--){
            set.add(arr[i]);
        }

        StringBuilder builder = new StringBuilder();
        int k = 0;
        for (Integer x : set){
            if (k == 0){
                builder.append(x);
            }
            else {
                builder.append(" ");
                builder.append(x);
            }
            k++;
        }
        String res = builder.reverse().toString();
        System.out.println(res);
    }
}
