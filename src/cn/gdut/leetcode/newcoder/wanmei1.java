package cn.gdut.leetcode.newcoder;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName wanmei1
 * @Desctiption TODO
 * 100 20
 * 50
 * @Date 2020/4/14 19:13
 */
public class wanmei1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str1 = s.split(" ");
        int [] weight = new int[str1.length];
        for (int i = 0; i < str1.length; i++){
            weight[i] = Integer.parseInt(str1[i]);
        }
        int maxLoad = Integer.parseInt(sc.nextLine());
        int count = countLeastBoat(weight, maxLoad);
        System.out.println(count);

    }

    public static int countLeastBoat(int [] weight, int maxLoad){
        Arrays.sort(weight);
        int res = 0;
        int i = 0, j = weight.length - 1;
        while (i < j){
            if (weight[i] + weight[j] < maxLoad){
                i++;
                j--;
                res++;
            }
            else {
                res++;
                j--;
            }
        }
        return res;

    }
}
