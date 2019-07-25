package com.wyfdc.go.javabase.passByValue;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        ll.add("Lucy");
        System.out.print("before change: ll = ");
        ll.stream().forEach(x -> {
            System.out.print(x + " ");
        });
        addBob(ll);
        System.out.print("\nafter change: ll = ");
        ll.stream().forEach(x -> {
            System.out.print(x + " ");
        });
    }

    public static void addBob(List<String> ll) {
        ll.add("Bob");
    }
}
