package com.wyfdc.go.leetcode.hw;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//测试数据有多组
public class Questionnaire{
    public static void main(String[] args){
        int N=0;
        Set<Integer> set=new TreeSet<Integer>();
        //set没有排序的方法，
        //可以Set set = new TreeSet()
        //TreeSet存储的时候已经是排好序的
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            N=scanner.nextInt();
            set.clear();
            for(int i=0;i<N;i++){
                set.add(scanner.nextInt());
            }
            Iterator<Integer> it=set.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }

}