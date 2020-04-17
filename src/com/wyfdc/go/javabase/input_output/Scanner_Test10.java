package com.wyfdc.go.javabase.input_output;

import java.util.Scanner;

/**
 * 1、一定要读取到有效字符后才可以结束输入。
 * 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
 * 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
 * 4、next() 不能得到带有空格的字符串。
 */
public class Scanner_Test10 {

    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        //next方式接收字符串
        System.out.println("next方式接收数据");

        if(scanner.hasNext()){
            String str = scanner.next();
            System.out.println("键盘输入为： "+str);
        }
        //关闭输入流
        scanner.close();

    }

}
