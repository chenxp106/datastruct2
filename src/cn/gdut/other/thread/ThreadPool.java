package cn.gdut.other.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName ThreadPool
 * @Desctiption TODO
 * @Date 2020/4/12 21:18
 */

/**
 * 第四种获得多线程的方式，使用线程池
 */
public class ThreadPool {
    public static void main(String[] args) {
        // 创建5个线程，一个池五个处理线程
//        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        // 一池一个线程
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        ExecutorService threadPool = Executors.newCachedThreadPool();



        // 模拟10个用户来办理处理业务，每个用户就是一个来自外部的请求线程
        try {
            for (int i = 0; i < 20; i++) {
                threadPool.execute(() ->{
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }



}

















