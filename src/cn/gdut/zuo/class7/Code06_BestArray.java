package cn.gdut.zuo.class7;

import java.util.Arrays;

/**
 * @Desctiption 会议安排的场数最多
 * 贪心策略。
 * 有三种贪心方法，但是只有第三种是合理的。
 * 1、选择开始时间最早的。反例，有一场从早开到晚 。明显不可以
 * 2、选择会议时间最短的。反例，两个长会议中间夹带了一个短会议。
 * 3、选择最早结束的会议。选择剩下所有可以进行的并最早结束的会议
 * @Date 2020/1/4/004
 **/
public class Code06_BestArray {

    public static class Program {
        public int start;
        public int end;

        public Program(int start, int end){
            this.start = start;
            this.end = end;
        }

        public static int bestArrange(Program[] programs, int cur){
            // 按结束时间排序
            Arrays.sort(programs, (o1, o2) -> o1.end - o2.end);
            int result = 0;
            for (int i = 0;i < programs.length;i++){
                // 说明当前会议可以进行
                if (cur <= programs[i].start){
                    result++;
                    // 当前cur重新标记
                    cur = programs[i].end;
                }
            }
            return result;
        }
    }
}
