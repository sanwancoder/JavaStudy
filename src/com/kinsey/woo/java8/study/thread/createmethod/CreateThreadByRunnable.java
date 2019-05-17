package com.kinsey.woo.java8.study.thread.createmethod;

public class CreateThreadByRunnable implements  Runnable {

    @Override
    public void run() {
        System.out.println("CreateThreadByRunable...");
    }
}
