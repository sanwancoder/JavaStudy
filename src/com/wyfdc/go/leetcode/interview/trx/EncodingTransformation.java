package com.wyfdc.go.leetcode.interview.trx;

import java.io.UnsupportedEncodingException;

public class EncodingTransformation {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String helloUTF = "你好";
        String helloISO = new String(helloUTF.getBytes("UTF-8"), "ISO-8859-1");
        System.out.println(helloISO);
    }

}
