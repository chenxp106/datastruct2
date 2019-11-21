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
        int n = str.length();
        if (str.length() == 0 ){
            return res;
        }
        char [] chars = new char[n];
        chars = str.toCharArray();
        // 排序数组
        Arrays.sort(chars);
        // visited 数组
        boolean [] visited = new boolean[n];

        tracking(chars, visited, new StringBuilder());
        return res;
    }

    private void tracking(char [] chars, boolean [] visited, StringBuilder s){
        if (chars.length == s.length()){
            res.add(s.toString());
            return;
        }
        for (int i = 0;i < chars.length;i++){
            if (visited[i]){
                continue;
            }

            // 保证不重复
            if (i != 0 && chars[i] == chars[i-1] && !visited[i-1]){
                continue;
            }
            visited[i] = true;
            // 加入当前字符
            s.append(chars[i]);
            tracking(chars, visited, s);
            // 删除最后一个字符
            s.deleteCharAt(s.length() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Test38 test38 = new Test38();
        System.out.println(test38.Permutation("aab"));
    }
}
