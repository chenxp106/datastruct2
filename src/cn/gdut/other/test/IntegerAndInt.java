package cn.gdut.other.test;

public class IntegerAndInt {
    public static void main(String[] args) {
        // Integer 与int自动拆箱，将Integer转化为int。所以是相等的
        int i = 10;
        Integer i1 = new Integer(10);
        System.out.println(i  == i1); // true

        // new出来的是对象，不相等
        Integer i2 = new Integer(10);
        Integer i22 = new Integer(10);
        System.out.println(i2 == i22); // false

        // Integer 直接等于数字-128-127之间。保存到常量池。比较的是值，相等
        Integer i3 = 10;
        Integer i33 = 10;
        System.out.println(i3 == i33); // true

        // 直接赋值，超出了范围后，就不能看成int类型了。而是对象了，
        Integer i4 = 128;
        Integer i44 = 128;
        System.out.println(i4==i44); // false

        // 拆箱
        int i5 = 128;
        Integer i55 = new Integer(128);
        System.out.println(i5  == i55);   // true
    }
}
