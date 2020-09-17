package cn.gdut.bishi;

public class Test {
    public static void main(String[] args) {
        String a = "test";
        String b = "test";
        String c = new String("test");
        String d = new String("test");
        String e = a;
        String f = new String(a);
        String  g = a + "";
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);
        System.out.println(a==e);
        System.out.println(a==f);
        System.out.println(a==g);

        char bb = 49;
        System.out.println(bb);

        int i5 = 1232412413;
        Integer i55 = new Integer(1232412413);
        System.out.println(i5  == i55);   // true
    }
}
