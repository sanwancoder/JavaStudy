package com.wyfdc.go.thinkinginjava.chapter15;

public class TwoTuple<A,B> {

    //final 可以get但是不能set

    public final A first;

    public final B second;


    public TwoTuple(A a,B b){
        this.first = a;
        this.second = b;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer().append("(")
                .append(first)
                .append(",")
                .append(second)
                .append(")");
        return res.toString();
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> twoTuple = new TwoTuple<String, Integer>("hello",2019);
        System.out.println(twoTuple.toString());
    }
}
