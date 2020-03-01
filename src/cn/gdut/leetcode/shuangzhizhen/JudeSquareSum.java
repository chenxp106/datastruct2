package cn.gdut.leetcode.shuangzhizhen;

/**
 * @ClassName JudeSquareSum
 * @Desctiption 判断一个数是不是两个数的平方和
 * @Date 2020/3/1 8:59
 */
public class JudeSquareSum {
    public boolean judeSquareSum(int target){
        if (target < 0){
            return false;
        }
        // 计算两个下标
        int i = 0, j = (int) Math.sqrt(target);
        while (i <= j){
            int powSum  = i * i + j * j;
            if (powSum > target){
                j--;
            }
            else if (powSum < target){
                i++;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
