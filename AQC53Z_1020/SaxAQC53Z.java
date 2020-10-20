package com.tutorialspoint.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {

   boolean bszemely = false;
   boolean bnev = false;
   boolean bkor = false;
   boolean bvaros = false;

   @Override
   public void startElement(String uri, 
   String localName, String qName, Attributes attributes) throws SAXException {

      if (qName.equalsIgnoreCase("student")) {
         String rollNo = attributes.getValue("rollno");
         System.out.println("Roll No : " + rollNo);
      } else if (qName.equalsIgnoreCase("szemely")) {
         bszemely = true;
      } else if (qName.equalsIgnoreCase("nev")) {
         bnev = true;
      } else if (qName.equalsIgnoreCase("kor")) {
         bkor = true;
      }
      else if (qName.equalsIgnoreCase("varos")) {
         bvaros = true;
      }
   }

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("szemely")) {
         System.out.println("End Element :" + qName);
      }
   }

   @Override
   public void characters(char ch[], int start, int length) throws SAXException {
      
      if (bFirstName) {
         System.out.println("szemely: " 
            + new String(ch, start, length));
         bszemely = false;
      } else if (bLastName) {
         System.out.println("nev: " + new String(ch, start, length));
         bnev = false;
      } else if (bNickName) {
         System.out.println("kor: " + new String(ch, start, length));
         bkor = false;
      } else if (bMarks) {
         System.out.println("varos: " + new String(ch, start, length));
         bvaros = false;
      }
   }
}