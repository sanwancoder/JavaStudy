package com.wyfdc.go.interview;

import java.util.*;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode()//重写
    {
        return name.hashCode() + age;
    }

    public boolean equals(Object obj)//重写   Object不能换
    {
        if (!(obj instanceof Person))
            return false;
        Person p = (Person) obj;

        System.out.println(this.name + "...." + p.name);

        return this.name.equals(p.name) && this.age == p.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(new Person("lisi01", 30));
        hs.add(new Person("lisi02", 33));
        hs.add(new Person("lisi03", 35));
        hs.add(new Person("lisi02", 33));
        hs.add(new Person("lisi01", 30));
        hs.add(new Person("lisi04", 32));
        hs.add(new Person("lisi03", 35));

        Iterator it = hs.iterator();

        System.out.println("集合中的元素如下:\n===================================================");
        while (it.hasNext()) {
            Person p = (Person) it.next();
            sop(p.getName() + " " + p.getAge());
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);

    }
}
