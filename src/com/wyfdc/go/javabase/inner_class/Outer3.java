package com.wyfdc.go.javabase.inner_class;

/**
 * 局部内部类 ： 定义在方法中的类
 */
public class Outer3 {

    private static int a;

    private int b;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Outer3.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Outer3(int b) {
        this.b = b;
    }

    public void test(final int c){
        final int d = 9;
        class Inner{
            public void print(){
                System.out.println(c);
            }
        }
        new Inner().print(); //加一句
    }


    public static void main(String[] args) {

        Outer3 out = new Outer3(1);
        out.setB(2);
        out.test(4);

    }

}
