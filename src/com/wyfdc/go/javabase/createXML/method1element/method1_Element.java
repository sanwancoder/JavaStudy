package com.wyfdc.go.javabase.createXML.method1element;

import java.io.ByteArrayOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @Author:  
 */
public class method1_Element {

  public static void main(String[] args) {
    System.out.println(createXML());
  }

  public static String createXML(){
    String xmlStr = null;
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    try {
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.newDocument();
      document.setXmlVersion("1.0");
      document.setXmlStandalone(true);

      Element Aspt = document.createElement("Aspt");
      document.appendChild(Aspt);

      Element Version = document.createElement("Version");

      Element RegID = document.createElement("RegID");

      Element Logs = document.createElement("Logs");

      //单条Lo־
      Element Log = document.createElement("Log");

      Element Num_ID = document.createElement("Num_ID");
      Num_ID.setTextContent("350000100001");
      Log.appendChild(Num_ID);

      Element User_ID = document.createElement("User_ID");
      User_ID.setTextContent("350000198609065541");
      Log.appendChild(User_ID);

      Element Organization = document.createElement("Organization");
      Organization.setTextContent("大同市公安局");
      Log.appendChild(Organization);

      Element Organization_ID = document.createElement("Organization_ID");
      Organization_ID.setTextContent("140200");
      Log.appendChild(Organization_ID);

      Element User_Name = document.createElement("User_Name");
      User_Name.setTextContent("李明");
      Log.appendChild(User_Name);

      Element Terminal_ID = document.createElement("Terminal_ID");
      Terminal_ID.setTextContent("10.10.10.10");
      Log.appendChild(Terminal_ID);

      Element Operate_Time = document.createElement("Operate_Time");
      Operate_Time.setTextContent("20130506121212");
      Log.appendChild(Operate_Time);

      Element Operate_Type = document.createElement("Operate_Type");
      Operate_Type.setTextContent("1");
      Log.appendChild(Operate_Type);

      Element Operate_Result = document.createElement("Operate_Result");
      Operate_Result.setTextContent("1");
      Log.appendChild(Operate_Result);

      Element Error_Code = document.createElement("Error_Code");
      Error_Code.setTextContent("");
      Log.appendChild(Error_Code);

      Element Operate_Name = document.createElement("Operate_Name");
      Operate_Name.setTextContent("暂住人口查询");
      Log.appendChild(Operate_Name);

      Element Operate_Condition = document.createElement("Operate_Condition");
      Operate_Condition.setTextContent("");
      Log.appendChild(Operate_Condition);

      Logs.appendChild(Log);

      Aspt.appendChild(Version);
      Aspt.appendChild(RegID);
      Aspt.appendChild(Logs);

      TransformerFactory transFactory = TransformerFactory.newInstance();
      Transformer transFormer = transFactory.newTransformer();
      DOMSource domSource = new DOMSource(document);

      //export string
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      transFormer.transform(domSource, new StreamResult(bos));
      xmlStr = bos.toString();

    }catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return xmlStr;
  }

}
