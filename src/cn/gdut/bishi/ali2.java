package cn.gdut.bishi;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ali2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.valueOf(sc.nextLine().trim());

        int [][] arr = new int[m][2];
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            String trim = sc.nextLine().trim();
            String[] split = trim.split(" ");
            list.add(new Pair<>(Integer.valueOf(split[0]), Integer.valueOf(split[1])));
        }

    }

    // 删除一个节点
    private void deleteNode(int index, List<Pair<Integer, Integer>> list){
        Pair<Integer, Integer> node = list.get(index);
        int vale = node.getValue();
        for (int i = 0;  i< list.size(); i++){
            if (list.get(i).getValue() == vale){
                vale = list.get(i).getKey();
                list.remove(list.get(i));
            }
        }

    }


}
