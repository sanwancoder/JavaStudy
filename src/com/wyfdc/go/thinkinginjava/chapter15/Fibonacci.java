package com.wyfdc.go.thinkinginjava.chapter15;

import com.wyfdc.go.thinkinginjava.utils.Generator;

public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    private int fib(int n){
        if (n < 2) {
            return 1;
        }
        else {
            return fib(n-2) + fib(n-1);
        }
    }


    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        int i=0;
        while(i<18){
            i = i + 1;
         System.out.println(gen.next() + " ");
        }
    }

}
