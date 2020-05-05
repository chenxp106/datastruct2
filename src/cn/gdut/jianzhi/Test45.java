package cn.gdut.jianzhi;

import java.util.Arrays;

/**
 * @Desctiption 把数组排列成最小的数
 * 使用字符串比较、s1+s2 < s2+s2.则为s1,s2
 * @Date 2019/11/28/028
 **/
public class Test45 {
    public String PrintMinNumber(int [] numbers){
        String res = "";
        if (numbers == null || numbers.length == 0){
            return res;
        }
        String [] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            nums[i] = numbers[i] + "";
        }
        Arrays.sort(nums, (s1, s2) -> (s1+s2).compareTo(s2+s1));
        for (String str : nums){
            res += str;
        }
        return res;
    }

    public static void main(String[] args) {
        Test45 test45 = new Test45();
        int [] a = {3,32,321};
        System.out.println(test45.PrintMinNumber(a));
    }
}
