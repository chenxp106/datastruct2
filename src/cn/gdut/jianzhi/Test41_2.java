package cn.gdut.jianzhi;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Desctiption TODO
 * 字符流中第一个不重复的字符
 * 使用队列
 * @Date 2019/11/26/026
 **/
public class Test41_2 {

    Queue<Character> queue = new LinkedList<>();
    // 定义一个数组
    int [] chars = new int[256];

    public void Insert(char ch){
        queue.add(ch);
        chars[ch]++;
        while (!queue.isEmpty() && chars[queue.peek()] > 1){
            queue.poll();
        }

    }

    public char FirstApperinOnce(){
        return queue.isEmpty() ? '#' : queue.peek();
    }
}
