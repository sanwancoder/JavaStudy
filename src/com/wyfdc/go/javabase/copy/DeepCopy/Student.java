package com.wyfdc.go.javabase.copy.DeepCopy;

public class Student implements Cloneable {
    // 对象引用
    private Subject subj;
    private String name;

    public Student(String s, String sub) {
        name = s;
        subj = new Subject(sub);
    }

    public Subject getSubj() {
        return subj;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public Object clone() {
        // 深拷贝，创建拷贝类的一个新对象，这样就和原始对象相互独立
        Student s = new Student(name, subj.getName());
        return s;
    }
}

