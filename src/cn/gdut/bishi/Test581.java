package cn.gdut.bishi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test581 {
    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        ArrayList<String> res = new ArrayList<>();
        if (values == null ){
            return res;
        }
        Map<String, Integer> map = new HashMap<>();
        // 第一次遍历
        for (ArrayList<String> x : values){
            for (String y : x){
                map.put(y, map.getOrDefault(y, 1) + 1);
                if (map.get(y) <= 1){
                    map.remove(y);
                }
            }
        }

        for (String str : map.keySet()){
            Integer integer = map.get(str);
            if (integer > 1){
                res.add(str);
            }
        }
        return res;
    }
}
