package cn.gdut.bishi;

import java.util.HashMap;
import java.util.Map;


/**
 * 最长不重复子串
 */
public class helloblick {
    public static String findMaxSubstr (String str) {
        // write code here

        Map<Character, Integer> dic = new HashMap<>();
        int l = 0, r = 0;
        int i = -1, res = 0;
        for (int j = 0; j < str.length(); j++){
            if (dic.containsKey(str.charAt(j))){
                i = Math.max(i, dic.get(str.charAt(j)));
            }
            dic.put(str.charAt(j), j);
            if (j - i > res){
                r = j;
                l = i;
                res = j - i;
             }

        }
        return str.substring(l+1, r+1);

    }

    public static void main(String[] args) {
        String s = "abcdbcdcbabcdefggcwa";
        System.out.println(findMaxSubstr(s));
    }

}
