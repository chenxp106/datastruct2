package cn.gdut.bishi;

public class Test583 {
    /*public int translateNum (int num) {
        // write code here
        String str = String.valueOf(num);
        if (str.isEmpty()){
            return 0;
        }
        int [] dp = new int[str.length()];
        dp[0] = 1;
        for (int i= 1; i < str.length(); i++){
            dp[i] = dp[i-1];
            if (i > 1 && (str.charAt(i-2) == '1' || (str.charAt(i-2) == '2' && str.charAt(i-1) < '6')) ){
                dp[i] += dp[i-2];
            }
        }
        return dp[str.length() - 1];
    }*/

    public int translateNum (int num) {

        return fun(String.valueOf(num));

    }

    private int fun(String num){
        if (num.length() <= 1){
            return 1;
        }
        int a = num.charAt(0) - '0';
        int b = num.charAt(1) - '0';
        if (a == 0 || a > 2 || (a == 2 && b > 5)){
            return fun(num.substring(1));
        }
        return fun(num.substring(1)) + fun(num.substring(2));
    }

}
