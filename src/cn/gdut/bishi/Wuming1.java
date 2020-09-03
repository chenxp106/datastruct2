package cn.gdut.bishi;

import java.util.Arrays;

public class Wuming1 {
    public static void main(String[] args) {
        int [] a = {3,2,4};

        int [] visit = new int[a.length];
        Arrays.fill(visit, 0);
        int minIndex = getMin(a, 0, a.length);
        // 选择最小的下标
        while (visit[minIndex] != 0){
            if (minIndex > 0 && visit[minIndex - 1] == 0 && visit[minIndex + 1] == 0){
                visit[minIndex] = 1;
            }
        }


    }

    private static int getMin(int [] nums, int i, int j){
        int min = i;
        for (int k = i + 1; k <= j; k++){
            if (nums[k] < nums[min]){
                min = k;
            }
        }
        return min;
    }


}
