package com.wyfdc.go.thinkinginjava.chapter15;

public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {

    public final C third;

    public ThreeTuple(A a,B b,C c){
        super(a,b);
        this.third = c;

    }

    @Override
    public String toString(){
        StringBuffer s = new StringBuffer().append("(")
                .append(first)
                .append(",")
                .append(second)
                .append(",")
                .append(third)
                .append(")");
        return s.toString();
    }


    public static void main(String[] args) {
        ThreeTuple tt = new ThreeTuple<Double,String,Integer>(1.1,"1111aaaa",3);
        System.out.println(tt);
    }

}
