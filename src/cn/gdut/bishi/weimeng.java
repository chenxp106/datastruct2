package cn.gdut.bishi;

public class weimeng {

    public static boolean isJudege(int c){
        if(c == 0)
            return false;

        double eps = 1e-10;// 精度

        int sqrtN = (int)Math.sqrt(c);
        for(int i = 1; i < sqrtN; i++){
            int doubleA = i*i;
            double b = Math.sqrt(c - doubleA);
            if(b - (double)((int)b) < eps){
                return true;
            }
        }

        return false;
    }

}
