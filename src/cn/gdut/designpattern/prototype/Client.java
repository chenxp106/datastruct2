package cn.gdut.designpattern.prototype;

import java.util.Date;

/**
 * @ClassName Client
 * @Desctiption TODO
 * @Date 2020/6/27 16:36
 */
public class Client {
    public static void main(String[] args) {
        Sheep s1 = new Sheep("多利", new Date());
        System.out.println(s1);

        Sheep s2 = null;
        try {
            s2 = (Sheep) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        System.out.println(s2);
    }
}
