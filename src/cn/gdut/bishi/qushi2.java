package cn.gdut.bishi;

import java.util.*;

public class qushi2 {
    public static  List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = Integer.valueOf(sc.nextLine().trim());

//        String res = removeKdigitds(s, n);
        StringBuilder builder = new StringBuilder();
        tracking(0, builder, s,s.length() - n );

        int x = Collections.min(list);

        System.out.println(x);

    }

    private static String removeKdigitds(String nums, int n){
        return "";
    }

    private static void tracking(int start, StringBuilder builder, String str, int m){
        if (builder.length() == m){
            int temp = Integer.valueOf(builder.toString());
            list.add(temp);

            return;
        }

        for (int i = start; i < str.length(); i++){
            builder.append(str.charAt(i));
            tracking(i+1,builder, str, m);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    public String removeKdigits(String num, int k) {
        LinkedList<Character> stack = new LinkedList<Character>();

        for(char digit : num.toCharArray()) {
            while(stack.size() > 0 && k > 0 && stack.peekLast() > digit) {
                stack.removeLast();
                k -= 1;
            }
            stack.addLast(digit);
        }

        for(int i=0; i<k; ++i) {
            stack.removeLast();
        }

        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for(char digit: stack) {
            if(leadingZero && digit == '0') continue;
            leadingZero = false;
            ret.append(digit);
        }

        if (ret.length() == 0) return "0";
        return ret.toString();
    }

}
