package cn.gdut.leetcode.array;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName Volitale
 * @Desctiption TODO
 * @Date 2020/4/6 17:12
 */
public class Volitale {

    volatile int number = 0;


    public void addPuls(){
        this.number++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();
    public void addMyAromic(){
        atomicInteger.getAndIncrement();
    }

    public static void main(String[] args) {
        Volitale mydata = new Volitale();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    mydata.addPuls();
                    mydata.addMyAromic();

                }
            }, String.valueOf(i)).start();
        }
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "final " + mydata.number);
        System.out.println(Thread.currentThread().getName() + "final " + mydata.atomicInteger);
    }
}









