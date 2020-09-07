package cn.gdut.bishi;

import java.util.Arrays;

public class weimeng1 {
    public String[] sortMethod (String[] stringArray) {
        // write code here
        for (int i = 0;  i<stringArray.length; i++){
            stringArray[i] = stringArray[i].substring(1, stringArray.length - 1);

        }
        return BubbleSort(stringArray);
    }

    public static void swap(String[] split, int i, int j){
        String tmp = split[i];
        split[i] = split[j];
        split[j] = tmp;
    }

    // 冒泡排序（简单交换排序）
    public static String [] BubbleSort(String[] split){
        int len = split.length-1;
        while(len>0){
            for (int i=0; i<len; ++i){
                if(compare(split[i], split[i+1]))
                    swap(split, i, i+1);
            }
            --len;
        }
        return split;
    }

    public static boolean compare(String s1, String s2) {
        String[] ss1 = s1.split("\\.");
        String[] ss2 = s2.split("\\.");
        int len = ss1.length > ss2.length ? ss1.length : ss2.length;
        for (int i = 0; i < len; i++) {
            if (Integer.parseInt(ss1[i]) < Integer.parseInt(ss2[i])) {
                return true;
            }else if(Integer.parseInt(ss1[i]) > Integer.parseInt(ss2[i])){
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        weimeng1 weimeng1 = new weimeng1();
        String [] aa = {"1.1.1","1.1.2.10","1.1.3","1.1.2.2","1.20.1","1.10.1","1.2.2","1.3.0"};
        System.out.println(weimeng1.sortMethod(aa));
    }
}
