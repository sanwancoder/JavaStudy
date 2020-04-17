package com.wyfdc.go.justTest;

import java.io.*;

public class SerializableTest {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        System.out.println("序列化对象开始!");
        SuperClass superClass=new SuperClass("gong",27, "1301334028@qq.com");
        File rootfile=new File("d:/data");
        if(!rootfile.exists()) {
            rootfile.mkdirs();
        }
        File file=new File("d:/data/data.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(superClass);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("序列化对象完成!");

        System.out.println("反序列化对象开始!");
        FileInputStream fileInputStream=new FileInputStream(new File("d:\\data\\data.txt"));
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        SuperClass getObject=(SuperClass) objectInputStream.readObject();
        System.out.println("反序列化对象数据:");

        System.out.println("name:"+getObject.getName()+"\nage:"+getObject.getAge()+"\nemail:"+getObject.getEmail());
    }


}
