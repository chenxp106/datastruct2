package cn.gdut.other.timer;

import java.util.TimerTask;

/**
 * @ClassName Task
 * @Desctiption TODO
 * @Date 2020/8/29 9:25
 */
public class Task extends TimerTask {
    @Override
    public void run() {
        System.out.println("定时器");
    }
}
