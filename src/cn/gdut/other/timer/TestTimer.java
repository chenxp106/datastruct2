package cn.gdut.other.timer;

import java.util.Date;
import java.util.Timer;

/**
 * @ClassName TestTimer
 * @Desctiption TODO
 * @Date 2020/8/29 9:24
 */
public class TestTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Task task = new Task();
        timer.schedule(task, new Date() , 1000);
    }
}
