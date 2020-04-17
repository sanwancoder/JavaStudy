package com.wyfdc.go.javabase.inner_class;

/**
 * 静态内部类
 */
public class Outer1 {

    private static int a;

    private int b;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Outer1.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Outer1(int b) {
        this.b = b;
    }

    public static class Inner {
        public void print() {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
        Outer1 out = new Outer1(2);
        Outer1.setA(1);
        Outer1.Inner inner = new Inner();
        inner.print();
    }

}
