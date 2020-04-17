package com.wyfdc.go.javabase.input_output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Scanner_Test30 {
    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();

        while (sc.hasNextLine() && !(line = sc.nextLine()).equals("")) {
            String[] array = line.split(",");
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                l.add(Integer.parseInt(array[i]));
            }
            list.add(l);
        }
        sc.close();

        list.stream().forEach(x->{
            System.out.println(Arrays.toString(x.toArray()));
        });
    }
}
