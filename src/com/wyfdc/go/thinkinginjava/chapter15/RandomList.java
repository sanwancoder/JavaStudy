package com.wyfdc.go.thinkinginjava.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {

    private List<T> strorage = new ArrayList<>();
    private Random rand = new Random(47);


    public void add(T item){
        strorage.add(item);
    }

    public T select(){
        return strorage.get(rand.nextInt(strorage.size())); //不能使用下标进行访问
    }

    public static void main(String[] args) {


        RandomList<String> randomList = new RandomList<>();
        for(String s:"1 2 3 4 5 6 7 8 9 10 11".split(" ")){
            randomList.add(s);
        }

        for(int i=0;i<11;i++) {
            System.out.println(randomList.select());
        }
    }

}
