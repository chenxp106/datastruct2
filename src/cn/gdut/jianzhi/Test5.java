package cn.gdut.jianzhi;

public class Test5 {
    /**
     * 两次遍历
     * 第一次i往后扫描，j从末尾往后扫。遇到空格j+=2
     * 第二次从后往前扫
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str){
        // 两个指针
        int p1 = str.length() - 1;
        for (int i = 0 ;i<= p1;i++){
            if (str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int p2 = str.length() - 1;
        while (p1>=0 && p2 >p1){
            char c = str.charAt(p1--);
            if (c == ' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
            }
            else {
                str.setCharAt(p2--,c);
            }
        }
        return str.toString();

    }
}
