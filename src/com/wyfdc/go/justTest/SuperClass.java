package com.wyfdc.go.justTest;

import java.io.Serializable;

public class SuperClass implements Serializable {
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public SuperClass(String name,int age,String email) {
        this.name=name;
        this.age=age;
        this.email=email;
    }
}


