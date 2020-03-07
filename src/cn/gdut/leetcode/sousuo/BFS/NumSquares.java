package cn.gdut.leetcode.sousuo.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName NumSquares
 * @Desctiption TODO
 * @Date 2020/3/7 10:03
 */
public class NumSquares {

    public int numSquares(int n) {
        List<Integer> list = genSquare(n);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        boolean [] marked = new boolean[n+1];
        marked[n] = true;
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            while(size-- > 0){
                int cur = queue.poll();
                for(int s : list){
                    int next = cur - s;
                    if(next < 0){
                        break;
                    }
                    if(next == 0){
                        return level;
                    }
                    if (marked[next]) {
                        continue;
                    }
                    marked[next] = true;
                    queue.add(next);
                }
            }
        }
        return n;
    }



    public List<Integer> genSquare(int n){

        List<Integer> list = new ArrayList<>();
        int i = 1;
        int diff = 3;
        while (i < n){
            list.add(i);
            i = i + diff;
            diff+=2;
        }
        return list;
    }

}













