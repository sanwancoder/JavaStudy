package com.wyfdc.go.datastructure;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueTest {



    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(100, new Comparator<Integer>(){ //大顶堆，容量11
            @Override
            public int compare(Integer i1,Integer i2){
                return i2-i1;
            }});

        for(int i=0;i<100;i++){
            Random random = new Random();
            priorityQueue.add(random.nextInt(50));
        }
        priorityQueue.stream().forEach(x->{
            System.out.print(x + " ");
        });

        System.out.println("\n" + priorityQueue.peek());

        System.out.println(priorityQueue.comparator());

    }
}
