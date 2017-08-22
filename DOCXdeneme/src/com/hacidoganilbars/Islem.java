package com.hacidoganilbars;

import java.io.*;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
public class Islem  {
    public static void main( String[] args )
    {
        try {
        	//kendi dosya yolunu belirle word belgesini oku
            FileInputStream fis = new FileInputStream("C:/ilbars/dogan.docx");            
            XWPFWordExtractor oleTextExtractor =new XWPFWordExtractor(new XWPFDocument(fis));
            System.out.print(oleTextExtractor.getText());            
        } catch (Exception e) {
                e.printStackTrace();
        }
     }
}