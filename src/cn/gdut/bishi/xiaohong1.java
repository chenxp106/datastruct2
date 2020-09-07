package cn.gdut.bishi;

import java.util.Queue;
import java.util.Stack;

public class xiaohong1 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10,7,9,8,8,12,13,14,19};


    }

    private static int [] subSort(int [] arr){
        int n = arr.length;

        int i = 1;
        for (; i < n; i++){
            if (arr[i] > arr[i-1]){
                continue;
            }
        }
        if (i == n){
            return new int[]{-1,-1};
        }

        Stack<Integer> stack = new Stack<>();
        for (int j = 1; j < n; j++){
        }
        return new int[]{-1,-1};

    }
}
