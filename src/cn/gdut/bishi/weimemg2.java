package cn.gdut.bishi;

public class weimemg2 {
    public String reverseWord (String str) {

        char[] chars = str.toCharArray();
        int left;
        int right = 0;
        while (right < str.length()){
            while (right < str.length() && !Character.isLetter(chars[right]) ){
                right++;
            }
            left = right;
            while (right < str.length()&& Character.isLetter(chars[right])){
                right++;
            }
            reverseString(chars, left, right-1);
        }

        String res = "";
        for (int i = 0; i < chars.length; i++){
            res+=chars[i];
        }

        return res;

    }

    private void reverseString(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    public static void main(String[] args) {
        weimemg2 weimemg2 = new weimemg2();
        System.out.println(weimemg2.reverseWord("There is a dog."));
    }



}
