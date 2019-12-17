package cn.gdut.jianzhi;

/**
 * @Desctiption 把字符串转化为整数
 * @Date 2019/12/16/016
 **/
public class Test67 {
    public int StrToInt(String str){
        int res = 0;
        if (str == null || str.length() == 0){
            return res;
        }
        char [] chars = str.toCharArray();
        boolean isNeg = false;
        for (int i = 0;i < chars.length;i++){
            if (chars[i] == '-'){
                isNeg = true;
                continue;
            }
            if (chars[i] == '+'){
                continue;
            }
            if (chars[i] >= '0' && chars[i] <= '9'){
                res = res * 10 + chars[i] - '0';
            }
            else {
                return 0;
            }
        }
        if (res > Integer.MAX_VALUE){
            throw new RuntimeException("上溢出");
        }
        return isNeg ? -res : res;
    }

    public static void main(String[] args) {
        Test67 test67 = new Test67();
        test67.StrToInt("123");
    }
}
