package cn.gdut.other.teststring;

/**
 * @ClassName TestString
 * @Desctiption TODO
 * @Date 2020/4/26 10:18
 */
public class TestString {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str1 == str2);      // true
        System.out.println(str1 == str3);      // false
        System.out.println(str3 == str4);      // false
        System.out.println(str3.equals(str4)); // true
    }
}
