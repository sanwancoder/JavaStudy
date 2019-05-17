package com.kinsey.woo.java8.study.thread.createmethod;


public class MainTest {


    public static void main(String[] args) {
        CreateThreadByRunnable creatThreadMethod1 =  new CreateThreadByRunnable();
        Thread thread = new Thread(creatThreadMethod1,"通过实现Runable接口创建线程");
        thread.run();


        CreateThreadByExtends threadByExtends  = new CreateThreadByExtends();
        threadByExtends.run();


    }

}
