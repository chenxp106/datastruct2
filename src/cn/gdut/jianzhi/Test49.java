package cn.gdut.jianzhi;

/**
 * @Desctiption 丑数
 * @Date 2019/12/2/002
 **/
public class Test49 {
    public int GetUglyNumber_Solution(int index){
        /*if (index <= 0){
            return 0;
        }
        // 动态规划。由多个2,3,5,相乘的结果
        int [] dp = new int[index+1];
        dp[0] = 1;
        int i2 =0;
        int i3 =0;
        int i5 =0;
        for (int i = 1; i <= index;i++){
            int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
            // 判断哪一个是最小的，
            int next = Math.min(next2, Math.min(next3, next5));
            // 看看是哪个数其作用，将起作用的的i++
            if (next == next2){
                i2++;
            }
            if (next == next3){
                i3++;
            }
            if (next == next5){
                i5++;
            }
            // 将最小的数放入dp中
            dp[i] = next;
        }
        return dp[index-1];*/
        if (index <= 0){
            return 0;
        }
        int [] dp = new int[index+1];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < index; i++){
            // 计算当前的值
            int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
            int next = Math.min(next2, Math.min(next3, next5));
            // 哪个起作用
            if (next == next2){
                i2++;
            }
            if (next == next3){
                i3++;
            }
            if (next == next5){
                i5++;
            }
            // 将该数放到数组中
            dp[i] = next;
        }
        return dp[index-1];
    }

    public static void main(String[] args) {
        Test49 test49 = new Test49();
        System.out.println(test49.GetUglyNumber_Solution(4));
    }
}
