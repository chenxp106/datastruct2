package cn.gdut.leetcode.newcoder;

import java.util.Scanner;

/**
 * @ClassName qian2
 * @Desctiption TODO
 * @Date 2020/3/28 19:49
 */
public class qian2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[9];
        String[] split = sc.nextLine().split(",");
        for (int i = 0; i < 9; i++){
            nums[i] = Integer.valueOf(split[i]);
        }

        int num1 = nums[0] + nums[1] + nums[2] + nums[3];
        int num2 = nums[3] + nums[4] + nums[5] + nums[6];
        int num3 = nums[6] + nums[7] + nums[8] + nums[0];
        if (num1 == num2 && num2 == num3){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
