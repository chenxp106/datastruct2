package cn.gdut.leetcode.dp.fengezhengshu;

/**
 * @ClassName IntegerBreak
 * @Desctiption TODO
 * @Date 2020/3/21 8:39
 */
public class IntegerBreak {
    int [] dp;
    public int integerBreak(int n){
        if (n <= 2){
            return 1;
        }
        if (n == 3){
            return 2;
        }
        int timeOf3 = n / 3;
        int timeOf2 = (n - timeOf3 * 3) / 2;
        if (n - timeOf3 * 3 == 1){
            timeOf3 = timeOf3 - 1;
            timeOf2 = (n  - timeOf3 * 3) / 2;
        }
        return (int ) (Math.pow(3, timeOf3) * Math.pow(2, timeOf2));
    }

    public int integerBreak2(int n){
        dp = new int[n+1];
        return integerB(n);
    }

    private int integerB(int n){

        if (n == 1){
            return 1;
        }
        int res = 0;
        // 分割成两个数
        for (int i = 1; i <= n - 1; i++){
            res = Math.max(i * integerB(n - i), Math.max(res, i * (n - i)));
        }
        return res;

    }

    public static void main(String[] args) {
        IntegerBreak integerBreak = new IntegerBreak();
        System.out.println(integerBreak.integerBreak2(13));
    }
}
