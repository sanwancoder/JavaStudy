package com.wyfdc.go.javabase.inner_class;

/**
 * 成员内部类
 */
public class Outer2 {

    private static int a;

    private int b;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Outer2.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Outer2(int b) {
        this.b = b;
    }

    public class Inner {
        public void print() {
            System.out.println(a);
            System.out.println(b);
        }
    }


    public static void main(String[] args) {
        Outer2 out = new Outer2(2);
        Outer2.setA(1);
//        Outer2.Inner in = new Outer2(3).new Inner();
        Outer2.Inner in = out.new Inner();

        in.print();

    }

}
