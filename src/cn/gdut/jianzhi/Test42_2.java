package cn.gdut.jianzhi;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Desctiption TODO
 * 字符流中第一个不重复的字符
 * @Date 2019/11/26/026
 **/
public class Test42_2 {

    int [] chars = new int[26];
    Queue<Character> queue = new LinkedList<>();

    public void Insert(char ch){
        chars[ch-'a']++;
        queue.add(ch);
        while (!queue.isEmpty() && chars[queue.peek()] > 1){
            queue.poll();
        }

    }

    public char FirstApperinOnce(){
        return queue.isEmpty() ? '#' : queue.peek();
    }
}
