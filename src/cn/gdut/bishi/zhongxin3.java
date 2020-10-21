package cn.gdut.bishi;

import cn.gdut.other.threadpool.InternalTask;

public class zhongxin3 {
    public static void main(String[] args) {

        String s = "1600";
        System.out.println(toChinese(s));

    }

    static final String [] NUMBER = {"零","壹" ,"贰","叁","肆","伍","陆","柒","捌","玖","拾"};
    static final String [] IUNIT = {"元","拾","佰", "仟","万","拾","佰", "仟","亿","拾","佰", "仟","万","拾","佰", "仟"};
    static final String [] DUNIT = {"角","分","厘"};

    private static String toChinese(String str){

        String integerStr ;
        String decimalStr;

        if(str.indexOf(".") > 0){
            integerStr = str.substring(0, str.indexOf("."));
            decimalStr = str.substring(str.indexOf(".") + 1);
        }
        else if (str.indexOf(".") == 0){
            integerStr = "";
            decimalStr = str.substring(1);
        }
        else {
            integerStr = str;
            decimalStr = "";
        }

        if (integerStr.length() > IUNIT.length){
            return  "超出计算能力！";
        }

        int [] integers = toIntoArray(integerStr);
        if (integers.length > 1 && integers[0] == 0){
            return "抱歉，输入数字不符合要求！";
        }

        // 设置万单位
        boolean isWan = isWsn5(integerStr);
        // 小数
        int [] decimals = toIntoArray(decimalStr);

        return getChineseInterger(integers, isWan) + getChineseDecimal(decimals);


    }

    // 整数部分处理
    private static String getChineseInterger(int [] integers, boolean isWan){
        StringBuilder chineseInteger = new StringBuilder("");
        int len = integers.length;
        if (len == 1 && integers[0] == 0){
            return "";
        }
        for (int i = 0; i < len; i++){
            String key = "";
            // 亿
            if ((len - i) == 13){
                key = IUNIT[4];
            }
            else if ((len - i) == 9){
                key = IUNIT[8];
            }
            else if ((len - i) == 5 && isWan){
                key = IUNIT[4];
            }
            else if ((len - i) == 1){
                key = IUNIT[0];
            }
            if ((len - i) > i && integers[i+1] !=0){
                key += NUMBER[0];
            }
            chineseInteger.append(integers[i] == 0? key : (NUMBER[integers[i]] + IUNIT[len - i-1]));
        }
        return chineseInteger.toString();
    }

    private static String getChineseDecimal(int [] decimals){
        StringBuilder chinseDecimal = new StringBuilder("");
        for (int i = 0; i < decimals.length; i++){
            if (i == 3){
                break;
            }
            chinseDecimal.append(decimals[i] == 0 ? "" : (NUMBER[decimals[i]] + DUNIT[i]));
        }
        return chinseDecimal.toString();
    }

    /**
     * 将字符转化为数组
     * @param num
     * @return
     */
    private static int [] toIntoArray(String num){
        int [] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++){
            arr[i] = Integer.parseInt(num.substring(i,i+1));
        }
        return arr;
    }

    private static boolean isWsn5(String integerStr){
        int len = integerStr.length();
        if (len > 4){
            String subInteger = "";
            if (len > 8){
                subInteger = integerStr.substring(len - 8, len - 4);
            }
            else {
                subInteger = integerStr.substring(0, len - 4);
            }
            return Integer.parseInt(subInteger) > 0;
        }
        else {
            return false;
        }
    }

    private static boolean check(String str){
        char[] chars = str.toCharArray();
        for (char c : chars){
            if (c == '.'){
                continue;
            }
            else if (!Character.isDigit(c) ){
                return false;
            }
        }
        return true;
    }
}












