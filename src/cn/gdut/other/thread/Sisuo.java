package cn.gdut.other.thread;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Sisuo
 * @Desctiption 死锁是指两个或两个以上的进程在执行过程中
 * 因争夺资源而造成的一个互相等待的现象
 * 若无外力干涉他们都将无法推进下去
 * @Date 2020/4/13 11:31
 */
public class Sisuo {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new HoldLockThread(lockA, lockB), "threadAAA").start();
        new Thread(new HoldLockThread(lockB, lockA), "threadBBB").start();
    }
}

class HoldLockThread implements Runnable{

    private String lockA;
    private String lockB;

    public HoldLockThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName() +"\t 自己持有：" + lockA + "\t 尝试获取" + lockB);
                try {
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName() +"\t 自己持有：" + lockB + "\t 尝试获取" + lockA);
            }
        }
    }
}















