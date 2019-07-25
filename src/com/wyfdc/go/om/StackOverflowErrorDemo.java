package com.wyfdc.go.om;

public class StackOverflowErrorDemo {

    static int depth = 0;

    public void foo() {
        depth++;
        foo();
    }

    public static void main(String[] args) {
        StackOverflowErrorDemo demo = new StackOverflowErrorDemo();

        try {
            demo.foo();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("depth: " + depth);
        }
    }

}
