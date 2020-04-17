package com.wyfdc.go.juc.aqs.cyclicBarrier;


import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 * 热身运动
 */
public class PlayBasketballDemo2 {

    private static final int THREAD_NUM = 3;

    private static final Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        String[] names = {"王五", "李四", "冯北", "刘青扬", "刘士凯", "薛贵", "赵钱孙"};

        // 使用构造方法：public CyclicBarrier(int parties, Runnable barrierAction)
        // 参数parties表示一共有多少线程参与这次“活动”,barrierAction是可选的，用来指定当所有线程都完成这些必须的“任务”之后要干的其他事情
        CyclicBarrier barrier = new CyclicBarrier(THREAD_NUM , new Runnable() {
            @Override
            public void run() {
                // 最后写完数据的线程，会执行这个任务
                System.out.println("\n人都到齐了,开始热身运动\n");
            }
        });

        /**
         * 注意比较两者的下面两行代码结果异同
          */
        for (int i = 0; i < names.length; i++) {
            //输出 人都到齐了,开始热身运动 两次；如果不减一的话 有一个线程会一直等待着
            if (i < THREAD_NUM - 1) {
                Thread t = new Thread(new MyTask(barrier, names[i]), "线程名" + i);
                t.start();
            } else {
                // 最后一个线程延迟3秒执行
                Thread.sleep(3000);
                Thread t = new Thread(new MyTask(barrier, names[i]));
                t.start();
            }
        }
    }


    static class MyTask extends Thread {

        private CyclicBarrier barrier;

        private String name;

        public MyTask(CyclicBarrier barrier, String name) {
            this.barrier = barrier;
            this.name = name;
        }

        @Override
        public void run() {
            int time = random.nextInt(1000);
            System.out.println(name + " 从宿舍出发");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.out.println(name + " 到达篮球场");
            try {
                // 用来挂起当前线程，直至所有线程都到达barrier状态再同时执行后续任务；
                // 等待所有线程都调用过此函数才能继续后续动作
                // 只等待2s，那么最后一个线程3秒才执行，则必定会超时
//                barrier.await(2000, TimeUnit.MILLISECONDS);
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(name + " 开始热身");
        }

    }

}
