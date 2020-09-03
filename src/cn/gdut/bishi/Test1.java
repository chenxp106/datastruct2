package cn.gdut.bishi;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.valueOf(sc.nextLine().trim());
        String key = sc.nextLine().trim();
        String[] split = key.split(" ");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++){
            list.add(sc.nextLine());
        }
        Map<String, Integer> map = new HashMap<>();
        for (String str : list){
            int i = computSpace(str);
            map.put(str, i);
            if (i != 1){

            }
        }
        System.out.println(computSpace("  aa:"));
    }

    private static int computSpace(String str){
        char[] chars = str.toCharArray();
        int count = 0;
        int i = 0;
        while ( Character.isSpaceChar(chars[i])){
            count++;
            i++;
        }
        return count;
    }
}
