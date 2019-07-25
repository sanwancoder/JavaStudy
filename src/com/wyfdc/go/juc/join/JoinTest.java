package com.wyfdc.go.juc.join;

/**
 * https://blog.csdn.net/hesong1120/java/article/details/64906716
 */
public class JoinTest {

    public static void main(String[] args) {
        ThreadBoy boy = new ThreadBoy();
        boy.start();
    }

}

class ThreadBoy extends Thread {
    @Override
    public void run() {
        System.out.println("男孩和女孩准备出去逛街");
        ThreadGirl girl = new ThreadGirl();
        girl.start();
        try {
            //没有传入时间 boyThread线程 会一直等下去 知道 girl 结束
            girl.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("男孩和女孩开始去逛街了");
    }
}

class ThreadGirl extends Thread {
    @Override
    public void run() {
        int time = 5000;
        System.out.println("女孩开始化妆,男孩在等待。。。");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("女孩化妆完成！耗时" + time);
    }
}