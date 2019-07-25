package com.wyfdc.go.javabase.serialization;

import com.alibaba.fastjson.JSON;
import java.text.SimpleDateFormat;

/**
 * @Author:
 */
public class Test {

  public static void main(String[] args) {
/*    Student s = new Student();
    s.setId("0002");
    s.setClassID("C00001");
    s.setName("lucy");
    s.setFrom("beijing");

    System.out.println(JSON.toJSONString(s));  // {"classID":"C00001","id":"0002","name":"lucy"}


    Long timeStamp = 1567567584000L;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    String date  = sdf.format(timeStamp);
    System.out.println(date);*/

    String url = "http://10.231.50.24:8080/v4/objectStorage/archive-result-param/weed---356-_145f7c3afa8441?content-type=application/vnd.ms-excel&downloadFilename=相机批量导出信息.xls";
    int i = url.indexOf("archive-result-param/");
    int iii = url.indexOf("?content-type");
    String ss = url.substring(i+"archive-result-param/".length(),iii);
    System.out.println(ss);

  }

}
