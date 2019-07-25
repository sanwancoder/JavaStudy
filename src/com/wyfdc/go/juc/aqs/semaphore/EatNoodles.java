package com.wyfdc.go.juc.aqs.semaphore;

import java.util.concurrent.Semaphore;

/**
 * 吃饭问题
 * 现在 N 个人；M双筷子
 */
public class EatNoodles {

    private static int PEOPLE_NUM = 8;            //人数

    private static int CHOPSTICKS_NUM = 5;   //筷子个数

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(CHOPSTICKS_NUM);
        String[] names = {"Lucy", "Lily", "Tom", "Sam", "Gates", "James", "Kates", "Trump", "Zoe", "Mia"};
        for (int i = 0; i < PEOPLE_NUM; i++)
            new Worker(names[i], semaphore).start();
    }

    static class Worker extends Thread {
        private String name;
        private Semaphore semaphore;

        public Worker(String name, Semaphore semaphore) {
            this.name = name;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println(this.name + " 占用一双筷子在吃饭...");
                Thread.sleep(2000);
                System.out.println(this.name + " 吃完饭释放筷子...");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}