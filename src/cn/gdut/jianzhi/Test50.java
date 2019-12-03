package cn.gdut.jianzhi;

import java.util.Arrays;
import java.util.Map;

/**
 * @Desctiption 第一个只出现一次的字符
 * @Date 2019/12/2/002
 **/
public class Test50 {
    public int FirstNotRepRepeatingChar(String str){
        // 存储数组
        int [] data = new int[256];
        // 第一次遍历数组
        for (int i= 0;i < str.length(); i++){
            data[str.charAt(i)]++;
        }
        // 第一次遍历，找到第一个数
        for (int i = 0;i < str.length(); i++){
            if (data[str.charAt(i)] == 1){
                return i;
            }
        }
        // 否则返回-1；
        return -1;
    }
}
