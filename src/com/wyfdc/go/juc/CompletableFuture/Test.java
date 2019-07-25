package com.wyfdc.go.juc.CompletableFuture;

public class Test {

    public static void main(String[] args) {
        long[] numbers = new long[100];
        for(int i=1;i<101;i++)numbers[i-1] = i;
        ExecutorServiceCalculator executorServiceCalculator =
                new ExecutorServiceCalculator();
        long sum = executorServiceCalculator.sumUp(numbers);
        System.out.println(sum);
    }
}
