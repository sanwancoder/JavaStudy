package com.wyfdc.go.juc.aqs.countDownLatch;

import com.wyfdc.go.utils.ArrayUtils;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CloseDoor2 {

    public static void main(String[] args) {
        String[] names = ArrayUtils.getNameArray();

        System.out.println("同学离开中");
        CountDownLatch countDownLatch = new CountDownLatch(5);
        CloseDoor2 closeDoor = new CloseDoor2();
        for(int i=0;i<5;i++){
            final int j = i;
            new Thread(() -> {
                closeDoor.sayBye(names[j],countDownLatch);
            }).start();
        }
        //班长锁门
        try {
            countDownLatch.await();
            System.out.println("班长锁门");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void sayBye(String name,CountDownLatch countDownLatch) {
        try {
            Random random = new Random();
            int i = random.nextInt(10);
            System.out.println(name + " pack books to bag,收拾书包预计花费 " + i + "s");
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " is gone");
        countDownLatch.countDown();
    }

}
