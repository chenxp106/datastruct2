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
        // 将字符串转化为字符数组
        char[] chars = str.toCharArray();
        // 要对集合排序
        Arrays.sort(chars);
        tracking(chars, new boolean[chars.length], new StringBuilder());
        return res;
    }


    private void tracking(char [] chars, boolean [] visited, StringBuilder s){
        if (s.length() == chars.length){
            res.add(s.toString());
            return;
        }

        for (int i = 0; i < chars.length;i++){
            // 如果访问过
            if (visited[i]){
                continue;
            }
            // 保证当前加入的字符不重复
            if (i != 0 && chars[i] == chars[i-1] && !visited[i-1]){
                continue;
            }
            // 标记被访问过
            visited[i] = true;
            // 加入s中
            s.append(chars[i]);
            // 递归访问
            tracking(chars, visited, s);
            // 移除一个元素
            s.deleteCharAt(s.length() - 1);
            // 标记未被访问
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Test38 test38 = new Test38();
        System.out.println(test38.Permutation("aab"));
    }
}
