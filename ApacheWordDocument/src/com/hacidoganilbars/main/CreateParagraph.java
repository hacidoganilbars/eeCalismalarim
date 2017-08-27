package com.hacidoganilbars.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class CreateParagraph {
	public static void main(String[] args) {
		
		XWPFDocument document = new XWPFDocument();
		FileOutputStream fos =null;
		
		try {
			
			fos= new FileOutputStream(new File("C://asdf/benimdoc.docx"));

			XWPFParagraph paragraf = document.createParagraph();
			XWPFRun run = paragraf.createRun();
			run.setText(
					"Gönül iliþkilerimde edindiðim tecrübe erkeklerin daha"
					+ " çok acý çektiði. Aslýnda bu acý karþýlýklýdýr. "
					+ "Kadýnýn çektiði acý gerçektir ama erkeðin acýsý fazladýr");
			document.write(fos);
			System.out.println("Yazma iþlemi tamamlandý!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
