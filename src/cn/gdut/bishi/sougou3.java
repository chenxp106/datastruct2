package cn.gdut.bishi;

import java.util.HashSet;
import java.util.Set;

public class sougou3 {

    public Set<String> set= new HashSet<>();
    public long getPasswordCount(String password){
        char[] chars = password.toCharArray();
        set.add(password);
        int n = password.length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= 9; i ++){
            builder.append(i);
            tracking(builder, n,chars);
            builder.deleteCharAt(builder.length() - 1);
        }

        return set.size() - 1;
    }

    private void tracking( StringBuilder builder, int n, char [] chars){

        if (builder.length() == n){
            set.add(builder.toString());
            return;
        }

        int bn = builder.length();
        int a =  builder.charAt(bn - 1) - '0';
        int b = chars[bn] - '0';
        int res = (a+b) / 2;
        if ( (a+b) %2 == 0){
            builder.append(res);
            tracking(builder, n, chars);
            builder.deleteCharAt(builder.length() - 1);
        }
        else {
            builder.append(res);
            tracking(builder, n, chars);

            builder.deleteCharAt(builder.length() - 1);
            builder.append(res+1);
            tracking(builder, n, chars);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    public static void main(String[] args) {
        sougou3 sougou1 = new sougou3();
        System.out.println(sougou1.getPasswordCount("3"));
    }

}
