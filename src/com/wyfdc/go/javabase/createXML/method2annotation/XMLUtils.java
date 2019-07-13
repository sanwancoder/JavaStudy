package com.wyfdc.go.javabase.createXML.method2annotation;


import com.wyfdc.go.javabase.createXML.method2annotation.entity.CityProvinceDTO;
import com.wyfdc.go.javabase.createXML.method2annotation.entity.People;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * @Author:
 */

public class XMLUtils {

  public static void main(String args[]) {
    People p = new People();
    CityProvinceDTO dto = new CityProvinceDTO("11", "1111");
    CityProvinceDTO dto2 = new CityProvinceDTO("22", "2222");
    p.getDtos().add(dto);
    p.getDtos().add(dto2);
    convertToXml(p, "utf-8");
  }

  public static String convertToXml(Object obj, String encoding) {
    String result = null;
    try {
      JAXBContext context = JAXBContext.newInstance(obj.getClass());
      Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);
      marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);

      StringWriter writer = new StringWriter();
      marshaller.marshal(obj, writer);
      result = writer.toString();
      System.out.println(result);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }


}
