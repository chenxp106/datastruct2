package cn.gdut.leetcode.tanxin;

import java.util.Arrays;

/**
 * @ClassName EraseOverlapIntervals
 * @Desctiption 不重叠的区间个数。删除多少个个区间可以不重复。输入: [ [1,2], [1,2], [1,2] ] 输出2，即删除两个[1,2]
 * @Date 2020/3/5 9:18
 */
public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int [][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (o1, o2) -> o1[1] - o2[1]);
        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] < end){
                continue;
            }
            end = intervals[i][1];
            cnt++;
        }
        return intervals.length - cnt;
    }

    public static void main(String[] args) {
        EraseOverlapIntervals eraseOverlapIntervals = new EraseOverlapIntervals();
        int [][] nums = { {1,2}, {2,3}, {3,4}, {1,3} };
        System.out.println(eraseOverlapIntervals.eraseOverlapIntervals(nums));

    }
}
