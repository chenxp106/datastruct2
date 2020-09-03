package cn.gdut.bishi;

import java.util.*;

public class huawei3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int [][] arr = new int[n][2];
        for (int i = 0; i < n; i++){
            String[] s = sc.nextLine().trim().split(" ");
            arr[i][0] = Integer.valueOf(s[0]);
            arr[i][1] = Integer.valueOf(s[1]);
        }

        Map<Integer, List<Map<Integer, Integer>>> map = new HashMap<>();


        System.out.println("null");

    }
}
