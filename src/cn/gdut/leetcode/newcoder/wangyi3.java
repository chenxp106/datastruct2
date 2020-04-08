package cn.gdut.leetcode.newcoder;

import java.util.*;

/**
 * @ClassName wangyi3
 * @Desctiption TODO
 * @Date 2020/4/7 20:04
 */
public class wangyi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int f = sc.nextInt();

        List<List<Integer>> nums = new ArrayList<>();


        List<Integer> list =new ArrayList<>();
        String s = sc.nextLine();
        String [] str = s.split(" ");
        for (int j = 0; j < str.length; j++){
            list.add(Integer.valueOf(str[j]));
        }
        nums.add(list);

        String ss = sc.nextLine();
        List<Integer> list2 =new ArrayList<>();
        String [] str2 = ss.split(" ");
        for (int j = 0; j < str2.length; j++){
            list2.add(Integer.valueOf(str2[j]));
        }
        nums.add(list2);

        System.out.println(nums);

        Set<Integer> people = new HashSet<>();
        people.add(f);

        for (int i = 0; i < nums.size();i++){
            boolean flag = false;
            for (int j = 0; j < nums.get(i).size(); i++){
                if (people.size() == nums.get(i).get(j)){
                    flag = true;
                    break;
                }
            }
            if (flag){
                for (int k = 0; k < nums.get(i).size();k ++){
                    people.add(nums.get(i).get(k));
                }
            }
        }
        System.out.println(people.size());

    }
}
