package cn.gdut.bishi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class shenzhou2 {
    private int getRes(String inData){
        String[] s = inData.split(" ");
        int n = s.length;
        int [] data = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            data[i] = Integer.parseInt(s[i]);
            map.put(Integer.parseInt(s[i]),i);
        }

        Arrays.sort(data);

        int index = map.size(), count = 0;
        for (int i = 0; i < map.size()-1; i++){
            if (map.get(data[i]) > map.get(data[i+1])){
                map.put(data[i+1], index++);
                count++;
            }
        }
        return count;
    }
}
