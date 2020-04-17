package com.wyfdc.go.thread;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Retry {

    private static int TRY_TIME = 3;

    public static void main(String[] args) {
        Retry retry = new Retry();
        String str = "hello";
        new Thread(() -> {
            retry.again("hello1", 0);
        }, "线程1").start();
        new Thread(() -> {
            retry.again("hello2", 0);
        }, "线程2").start();
    }

    public void again(Object object, int tryTimes) {
        if (tryTimes < TRY_TIME) {
            Random random = new Random();
            int i = random.nextInt(5);
            try {
                TimeUnit.SECONDS.sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(object + " ----->>>: " + i);
            if (i == 3) {
                System.out.println(object + " succes");
                return;
            } else {
                again(object, tryTimes + 1);
            }
        } else {
            System.out.println(object + " 重试次数超过三次,失败");
        }
    }


}
