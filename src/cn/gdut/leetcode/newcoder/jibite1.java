package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName jibite1
 * @Desctiption TODO
 * @Date 2020/4/1 19:37
 */
public class jibite1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 2;
        for (int i = n; i >  1; i--){
            if (isPrime(i)){
                a1 = i;
                break;
            }
        }
        int a2 ;
        for (int j = n +1; ; j++){
            if (isPrime(j)){
                a2 = j;
                break;
            }
        }
        if (Math.abs(a1 - n) < Math.abs(a2 - n)){
            System.out.println(a1);
        }
        else {
            System.out.println(a2);
        }

    }

    public static boolean isPrime(int num){
        if (num <= 3){
            return num > 1;
        }

        if (num % 6 != 1 && num % 6 != 5){
            return false;
        }

        int sqrt =(int) Math.sqrt(num);
        for (int i = 5; i<= sqrt; i += 6 ){
            if (num % i == 0 || num % (i + 2) == 0){
                return false;
            }

        }
        return true;
    }
}
