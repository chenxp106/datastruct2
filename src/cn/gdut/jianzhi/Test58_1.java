package cn.gdut.jianzhi;

/**
 * @Desctiption 翻转单词顺序表
 * 先翻转单词，然后在翻转整句
 * @Date 2019/12/8/008
 **/
public class Test58_1 {
    public String ReverseSentence(String str){
        if (str == null || str.length() == 0){
            return "";
        }
        int n = str.length();
        char[] chars = str.toCharArray();
        int i = 0, j = 0;
        while (j <= n){
            if (j == n || chars[j] == ' '){
                reverse(chars, i, j - 1);
                i = j+1;
            }
            j++;
        }
        reverse(chars, 0, n - 1);
        return new String(chars);
    }

    private void reverse(char [] chars, int i, int j){
        while (i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }

}
