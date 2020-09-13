package cn.gdut.bishi;

import java.util.Date;
import java.util.Stack;

public class huawei6 {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Date date = new Date();
            Thread.sleep(5000);
            System.out.println(date.getYear() + "-" + date.getMonth() + '-' + date.getDay()
                + ' ' + date.getHours() + ' ' + date.getMinutes() + ':' + date.getSeconds()
            );
        }
    }
}
