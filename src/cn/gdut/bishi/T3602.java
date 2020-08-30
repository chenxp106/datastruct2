package cn.gdut.bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName T3602
 * @Desctiption TODO
 * @Date 2020/8/22 20:00
 */
public class T3602 {
    /**
     * 4 3
     * 1 2 1
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int n = Integer.valueOf(s1[0]);
        int m = Integer.valueOf(s1[1]);

        int [] aa = new int[n];
        for (int i = 0; i < n; i++){
            aa[i] = i + 1;
        }

        String s2 = sc.nextLine();
        String[] s3 = s2.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++){
            list.add(Integer.valueOf(s3[i]));
        }

        for (Integer op : list){
            if (op == 1){
                reverse(aa);
            }
            else if (op == 2){
                reverse2(aa);
            }
            else {
                break;
            }
        }

        for (int i = 0; i < aa.length; i ++){
            System.out.print(aa[i]);
            if (i != aa.length - 1){
                System.out.print(" ");
            }
        }
    }

    /**
     * 第一种操作
     * @param arr
     */
    private static void reverse(int [] arr){
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = tmp;
    }

    private static void reverse2(int [] arr){
        for (int i = 0; i < arr.length - 1; i+= 2){
            int tmp  = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }
    }
}
