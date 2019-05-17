package com.kinsey.woo.java8.study.thread.createmethod;

public class CreateThreadByExtends extends  Thread {


    @Override
    public void run() {
        System.out.println("CreateThread By Extends thread");
    }
}
