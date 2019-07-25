package com.wyfdc.go.juc.aqs.countDownLatch;

import com.wyfdc.go.utils.ArrayUtils;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CloseDoor {

    public static void main(String[] args) {
        String[] names = ArrayUtils.getNameArray();

        System.out.println("同学离开中");
        CountDownLatch countDownLatch = new CountDownLatch(5);
        CloseDoor closeDoor = new CloseDoor();
        for(int i=0;i<5;i++){
            final int j = i;
            new Thread(() -> {
                closeDoor.sayBye(names[j]);
                countDownLatch.countDown();
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

    public void sayBye(String name) {
        try {
            System.out.println(name + " pack books to bag");
            Random random = new Random();
            TimeUnit.SECONDS.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " is gone");
    }

}
