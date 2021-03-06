package cn.gdut.jianzhi;

/**
 * @Desctiption TODO
 * @Date 2019/12/9/009
 **/
public class Test58_2 {
    public String LeftRotateString(String str, int n){
        if (str == null || str.length() == 0 || n > str.length()){
            return "";
        }
        char[] chars = str.toCharArray();
        reverse(chars, 0, n-1);
        reverse(chars, n, chars.length - 1);
        reverse(chars, 0, chars.length - 1);
        return new String(chars);
    }

    private void reverse(char [] chars, int i, int j){
        while (i < j){
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
    }
}
