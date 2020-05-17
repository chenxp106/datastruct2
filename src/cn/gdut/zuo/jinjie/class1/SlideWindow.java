package cn.gdut.zuo.jinjie.class1;

import java.util.LinkedList;

/**
 * @ClassName SlideWindow
 * @Desctiption TODO
 * @Date 2020/5/17 21:40
 */
public class SlideWindow {
    public static int [] getMaxWindow(int [] arr, int w){
        if (arr == null || w < 1 || arr.length < w){
            return null;
        }
        LinkedList<Integer> max = new LinkedList<>();
        int [] res = new int[arr.length - w + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            // 如果双端队列不为空，并且最后的值比当前的值小的时候，尾部弹出
            while (!max.isEmpty() && arr[max.peekLast()] <= arr[i]){
                max.pollLast();
            }
            // 加入当前数的下标
            max.addLast(i);
            // 判断左边的下标是否过期，过期的话弹出
            if (max.peekFirst() == i - w){
                max.pollFirst();
            }
            // 将当前的最大值加入到结果集res中
            if (i >= w - 1){
                res[index++] = arr[max.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {3,2,1,4,5,3,6,7};
        int[] maxWindow = getMaxWindow(arr, 3);
        for (int x : maxWindow){
            System.out.println(x);
        }
    }
}























