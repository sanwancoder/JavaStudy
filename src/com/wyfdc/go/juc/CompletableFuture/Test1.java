package com.wyfdc.go.juc.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        String s = "Lcuy";

        Test1 test1 = new Test1();

        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            return s + " ";
        }).thenApply(name -> {
            System.out.println(name);
            return test1.hello(s);
        }).thenApply(str -> {
            System.out.println(str);
            return test1.welcome(str);
        });


        stringCompletableFuture.thenAccept(System.out::println);

        System.out.println(stringCompletableFuture.get());

        CompletableFuture.supplyAsync(() -> {
            return s + " ";
        }).thenApply(name -> {
            return test1.hello(s);
        }).thenApply(str -> {
            return test1.welcome(str);
        }).thenAccept(System.out::println);

    }

    public String hello(String name){
        return "Hello,"+name;
    }

    public String welcome(String str){
        return str + ", welcome back.";
    }
}
