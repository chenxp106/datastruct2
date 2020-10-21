package cn.gdut.bishi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zhongxin2 {

    public static void main(String[] args) {
        String res = "cardeithlo";
        System.out.println(removeDup(res));

    }

    public static String removeDup(String str){

        String[] s = str.split(" ");
        for (int i = 0, j = s.length - 1; i < j ;i++, j--){
            String t  = s[i];
            s[i] = s[j];
            s[j] = t;
        }
        String temp = "";
        for (String t : s){
            temp += t;
        }

        char[] chars = temp.toCharArray();
        Set<Character> set = new HashSet<>();
        String res = "";
        for (char c : chars){
            if (!set.contains(c)){
                res += c;
                set.add(c);
            }

        }
        return res.toLowerCase();
    }


}
