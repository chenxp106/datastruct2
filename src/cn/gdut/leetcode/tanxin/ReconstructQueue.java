package cn.gdut.leetcode.tanxin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ReconstructQueue
 * @Desctiption 406 按升高和序号重组序列。
 * @Date 2020/3/6 9:18
 */

/**
 * 先按身高降序排序，再按个数升序排。
 * 然后再根据个数插入到list中，
 */
public class ReconstructQueue {
    public int [][] reconstructQueue(int [][] people) {

        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int [0][0];
        }

        // 排序
        Arrays.sort(people, (o1, o2) -> (o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));
        List<int []> queue = new ArrayList<>();
        for(int [] p : people ){
            queue.add(p[1],p);
        }
        return queue.toArray(new int [queue.size()][]);
    }
}
