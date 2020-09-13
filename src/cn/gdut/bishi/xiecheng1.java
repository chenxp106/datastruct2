package cn.gdut.bishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class xiecheng1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim() + " ";
        String str3 = sc.nextLine().trim();

        char[] chars1 = str1.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars1){
            map.put(c , map.getOrDefault(c, 1) + 1);
        }

        char[] chars2 = str2.toCharArray();
        char [] chars3 = str3.toCharArray();

        Map<Integer, Integer> map3 = new HashMap<>();
        int l = 0;

        int r = 0;
        while (r < chars2.length){
            if (Character.isLetter(chars2[r])){
                r++;
            }
            else {
                Map<Character, Integer> map1 = new HashMap<>();
                int t = l;
                for (; l < r; l++){
                    map1.put(chars2[l], map1.getOrDefault(chars2[l], 1) + 1);
                }

                int c = 0;
                for (Map.Entry<Character,Integer> en : map1.entrySet()){
                    if (en.getValue() != map.get(en.getKey())){
                        break;
                    }
                    c++;
                }

                l = t;
                r++;
                if (c != 0 && r - l == c + 1){
                    map3.put(l, r);
                    l = r;
                }

                l = r;
            }
        }

        for (Map.Entry<Integer, Integer> en : map3.entrySet()){
            String substring = str2.substring(en.getKey(), en.getValue()-1);
            str2 = str2.replace(substring, str3);
        }
        System.out.println(str2);
    }

}
