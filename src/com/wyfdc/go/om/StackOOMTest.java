package com.wyfdc.go.om;

public class StackOOMTest {

    public static void main(String[] args) {
        StackOOMTest test = new StackOOMTest();
        test.oomMethod();
    }

    public void oomMethod() {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    loopMethod();
                }
            }).start();
            ;
        }
    }

    private void loopMethod() {
        while (true) {
        }
    }
}