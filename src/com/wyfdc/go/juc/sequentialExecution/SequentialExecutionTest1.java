package com.wyfdc.go.juc.sequentialExecution;

public class SequentialExecutionTest1 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runner("A"));
        Thread t2 = new Thread(new Runner("B"));
        Thread t3 = new Thread(new Runner("C"));
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}

class Runner implements Runnable {
    public String name;

    Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "");

    }
}