package cn.gdut.bishi;

import java.util.Scanner;

public class shein {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim();

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        int [] map = new int[256];
        for (int i = 0; i < char2.length; i++){
            map[char2[i]]++;
        }
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int match = char2.length;
        while (right != char1.length){
            map[char1[right]]--;
            if (map[char1[right]] >= 0){
                match--;
            }
            if (match == 0){
                while (map[char1[left]] < 0){
                    map[char1[left++]]++;
                }
                minLen=Math.min(minLen, right-left+1);
                match++;
                map[char1[left++]]++;
            }
            right++;
        }
        minLen = minLen  == Integer.MAX_VALUE ? 0 : minLen;
        System.out.println(minLen);
    }
}



















