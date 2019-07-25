package com.wyfdc.go.juc.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Test2 {

    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });
        future.thenAccept(System.out::println);
    }


}
