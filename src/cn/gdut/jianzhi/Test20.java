package cn.gdut.jianzhi;

public class Test20 {
    public boolean isNumeric(char [] str){
        if (str == null || str.length == 0){
            return false;
        }
        // 记录 +-
        int index = 0;
        // 记录 e
        int encount = 0;
        // 记录.
        int point = 0;
        // + - 可以成为第一个字符
        if (str[0] == '-' || str[0] == '+'){
            index++;
        }
        // “+100”、”5e2”、”-123”、”3.1415”
        for (int i = index; i < str.length; i++){
             if (str[i] == '-' || str[i] == '+'){
                 if (str[i-1] == 'e' || str[i-1] == 'E'){
                     continue;
                 }
                 else {
                     return false;
                 }
             }

             // 如果是e，就不能出现在末尾，并且前面的必须是数字
            if (str[i] == 'e' || str[i] == 'E'){
                encount++;
                if (encount > 1){
                    return false;
                }
                if (i == 0 || i == str.length - 1){
                    return false;
                }
                if (str[i-1] > 57 || str[i-1] < 48){
                    return false;
                }
                point++;
                continue;
            }
            // 点不能出现，末尾只能出现一次，不能出现指数之后，所有在E出现后要标记
            if (str[i] == '.'){
                if (i == str.length - 1){
                    return false;
                }
                point++;
                if (point > 1){
                    return false;
                }
                continue;
            }
            // 如果以上符号都不是，在判断是不是其他字符
            if (str[i] > 57 || str[i] < 48){
                return false;
            }
        }
        return true;
    }
}


















