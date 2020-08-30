package cn.gdut.bishi;

import java.util.Scanner;

/**
 * @ClassName jingdong1
 * @Desctiption TODO
 * @Date 2020/8/27 19:24
 */
public class jingdong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 2;
        for(; i < 1000000; i++){
            if (count == n){
                break;
            }
            if (isPrime(i)){
                count++;
            }
            else if (is234(i)){
                count++;
            }
        }
        System.out.println(i-1);

    }

    // 判断素数
    private static boolean isPrime(int n)

    {

        if(n < 2) return false;

        for(int i = 2; i < n; ++i)

            if(n%i == 0) return false;

        return true;

    }

    // 判断22
    private static boolean is234(int n){
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (Integer.valueOf(chars[i]) == 2){
                continue;
            }
            else if (Integer.valueOf(chars[i]) == 3){
                continue;
            }
            else if (Integer.valueOf(chars[i]) == 5){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
