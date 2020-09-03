package cn.gdut.leetcode.sousuo.BFS;

import sun.plugin.javascript.navig.LinkArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName NumSquares
 * @Desctiption 组成整数的最小平方数量的个数
 * 13 = 4 + 9
 * @Date 2020/3/7 10:03
 */
public class NumSquares {


    /**
     * 生成小于n的平方序列
     * @param n
     * @return
     */
    private List<Integer> genSquares(int n){
        List<Integer> res = new ArrayList<>();
        int i = 1;
        int j = 1;
        while (i < n){
            res.add(i);
            j = j + 2;
            i = i + j;
        }
        return res;
    }

    public int numSquares(int n) {

        List<Integer> squra = genSquares(n);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        boolean [] visited = new boolean[n+1];
        visited[n] = true;
        int lever = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            lever++;
            while (size -- > 0){
                Integer cur = queue.poll();
                for (Integer x : squra){
                    int next = cur - x;
                    if (next < 0){
                        break;
                    }
                    if (next == 0){
                        return lever;
                    }
                    if (visited[next]){
                        continue;
                    }
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        return n;
    }










    /*public int numSquares(int n) {
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
    }*/

}













