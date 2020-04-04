package cn.gdut.leetcode.arrayfind;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName IsIsomorphic
 * @Desctiption 205 同构字符串
 * @Date 2020/4/4 10:52
 */
public class IsIsomorphic {
    public boolean isIsomorphic(String s,String t){
        // 简历hashmap简历对应关系
        Map<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            char ss = s.charAt(i);
            char ts = t.charAt(i);
            // 如果没有建立联系
            if (map.get(ss) == null){
                // 并且确保value没有当前值
                if (map.containsValue(ts)){
                    return false;
                }
                // 放入
                map.put(ss, ts);
            }
            // 如果已经建立了联系。确保能对应上
            else if (map.get(ss) != ts){
                return false;
            }
        }
        return true;
    }

}





















