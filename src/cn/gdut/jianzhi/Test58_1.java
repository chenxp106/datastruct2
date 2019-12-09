package cn.gdut.jianzhi;

/**
 * @Desctiption 翻转单词顺序表
 * 先翻转单词，然后在翻转整句
 * @Date 2019/12/8/008
 **/
public class Test58_1 {
    public String ReverseSentence(String str){
        // 判空
        if (str == null || str.length() == 0){
            return "";
        }
        // i,j,n 分别表示开头，结尾和长度
        int i = 0, j = 0, n = str.length();
        char[] chars = str.toCharArray();
        while (j <= n ){
            // 如果是一个单词
            if (j == n || chars[j] == ' '){
                // 将这个单词逆转
                reverse(chars, i, j-1);
                i = j+1;
            }
            // 不是一个单词，i++
            j++;
        }
        // 再逆转一次
        reverse(chars, 0, n-1);
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
