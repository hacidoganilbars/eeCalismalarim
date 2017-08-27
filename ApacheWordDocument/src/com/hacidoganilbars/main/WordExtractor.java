package com.hacidoganilbars.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class WordExtractor {
   public static void main(String[] args){
      
	   try {
		FileInputStream fis=   new FileInputStream("C://asdf/benimdoc.docx");
		 XWPFDocument docx = new XWPFDocument(fis);
		 XWPFWordExtractor we = new XWPFWordExtractor(docx);
	 	System.out.println(we.getText());
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
}