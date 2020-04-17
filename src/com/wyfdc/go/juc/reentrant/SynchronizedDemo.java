package com.wyfdc.go.juc.reentrant;

public class SynchronizedDemo {

    public static final String _LOCK = "hello";

    public void soutA(){
        synchronized (_LOCK) {
            System.out.println(Thread.currentThread().getName()+" A");
            soutB();
        }
    }

    public void soutB(){
        synchronized (_LOCK) {
            System.out.println(Thread.currentThread().getName()+" B\n");
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();

        Thread t1 = new Thread(()->{
            demo.soutA();
        },"t1");
        Thread t2 = new Thread(()->{
            demo.soutA();
        },"t2");
        t1.start();
        t2.start();
        while(t1.isAlive()||t2.isAlive()){}
        System.out.println("synchronized是可以重入的");
    }

}
