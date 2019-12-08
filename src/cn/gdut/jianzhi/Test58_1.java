package cn.gdut.jianzhi;

/**
 * @Desctiption 翻转单词顺序表
 * @Date 2019/12/8/008
 **/
public class Test58_1 {
    public String ReverseSentence(String str){
        if (str == null || str.length() == 0){
            return "";
        }
        char []  chars = str.toCharArray();

        int i = 0, j = 0;
        int n =str.length();
        while (j <= n){
            if (j == n || chars[j] == ' '){
                // 遇到一个单词，翻转
                reverse(chars, i, j-1);
                // i 从下一个单词开始计数
                i = j + 1;
            }
            // 没有遇到空格，继续
            j++;
        }
        reverse(chars,0, n-1);
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
