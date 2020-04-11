package cn.gdut.other.lock;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ContainerNotSafe
 * @Desctiption TODO
 * @Date 2020/4/10 16:50
 */
public class ContainerNotSafe {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = Collections.synchronizedList(new ArrayList<>());
        List<String> list2 = new CopyOnWriteArrayList<>();
        for (int i = 1; i <= 3; i++){
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }


    /**
     * 1、故障现象
     * 2、导致原因
     * 3、解决方案
     * 4、优化建议
     */


    public void testLock(){
        Lock lock = new ReentrantLock(true);
    }
}










