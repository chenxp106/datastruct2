package cn.gdut.jianzhi;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Desctiption 字符串的排列
 * @Date 2019/11/21/021
 **/
public class Test38 {

    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> Permutation(String str){
        if (str == null || str.length() == 0){
            return res;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int len = str.length();
        StringBuilder builder = new StringBuilder();
        boolean [] visited = new boolean[len];
        tracking(chars, builder, visited);
        return res;
    }

    private void tracking(char [] str, StringBuilder builder, boolean [] visited){
        if (builder.length() == str.length){
            res.add(builder.toString());
            return;
        }
        // 重复访问
        for (int i = 0; i < str.length; i++){
            if (visited[i]){
                continue;
            }
            if (i != 0 && str[i] == str[i-1] && !visited[i-1]){
                continue;
            }
            visited[i] = true;
            builder.append(str[i]);
            tracking(str, builder, visited);
            builder.deleteCharAt(builder.length() - 1);
            visited[i] = false;
        }
    }


    public static void main(String[] args) {
        Test38 test38 = new Test38();
        System.out.println(test38.Permutation("aab"));
    }
}
