package com.wyfdc.go.juc.join;

public class Join2000Test {

    public static void main(String[] args) {
        ThreadBoy2000 boy = new ThreadBoy2000();
        boy.start();
    }
}

class ThreadBoy2000 extends Thread {
    @Override
    public void run() {
        System.out.println("男孩和女孩准备出去逛街");
        ThreadGirl2000 girl = new ThreadGirl2000();
        girl.start();
        int time = 2000;
        try {
            // girl线程 加入到 boy线程 之中且等待 2000ms
            girl.join(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n男孩等了" + time + ", 不想再等了，自己去打游戏了\n");
    }
}

class ThreadGirl2000 extends Thread {
    @Override
    public void run() {
        int time = 5000;
        System.out.println("女孩开始化妆,男孩在等待。。。");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("女孩化妆完成！，耗时" + time);
    }
}