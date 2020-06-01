package com.wyfdc.go.juc.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExexutorServiceTest1 {

    public static void main(String[] args) {
        ThreadPoolExecutor  executorService = new ThreadPoolExecutor(2,
                4,
                1000,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(20));
        executorService.prestartAllCoreThreads();
    }
}
