package com.wyfdc.go.thinkinginjava.chapter15;

public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {

    public final D fourth;

    public FourTuple(A a,B b,C c,D d){
        super(a,b,c);
        this.fourth = d;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer().append("(")
                .append(first)
                .append(",")
                .append(second)
                .append(",")
                .append(third)
                .append(",")
                .append(fourth)
                .append(")");
        return s.toString();
    }

    public static void main(String[] args) {
        FourTuple<Integer,String,Double,String> fourTuple = new FourTuple<>(1,"aaa",11.22,"bbb");
        System.out.println(fourTuple);
    }
}
