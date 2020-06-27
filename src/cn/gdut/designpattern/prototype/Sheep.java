package cn.gdut.designpattern.prototype;

import java.util.Date;

/**
 * @ClassName Sheep
 * @Desctiption TODO
 * @Date 2020/6/27 16:31
 */
public class Sheep implements Cloneable{
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Sheep() {
    }

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "sname='" + sname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
