package com.wyfdc.go.java8.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {

/*        Employee e1 = new Employee("John", 25, 3000, 9922001);
        Employee e2 = new Employee("Ace", 22, 2000, 5924001);
        Employee e3 = new Employee("Keith", 35, 4000, 3924401);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        employees.forEach(System.out::println);

        System.out.println("排序后===============================");
//        employees.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        employees.forEach(System.out::println);*/


        String s = "010";
        String s2 = "7654";
        int count=0;
        for(int i=0;i<10;i++){
            count++;
            StringBuffer sb = new StringBuffer();
            sb.append(s).append("00").append(i).append(s2);
            System.out.println(sb.toString());
        }
        for(int i=10;i<100;i++){count++;
            StringBuffer sb = new StringBuffer();
            sb.append(s).append("0").append(i).append(s2);
            System.out.println(sb.toString());
        }
        for(int i=100;i<=999;i++){count++;
            StringBuffer sb = new StringBuffer();
            sb.append(s).append(i).append(s2);
            System.out.println(sb.toString());
        }

    }


}
