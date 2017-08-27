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
					"G�n�l ili�kilerimde edindi�im tecr�be erkeklerin daha"
					+ " �ok ac� �ekti�i. Asl�nda bu ac� kar��l�kl�d�r. "
					+ "Kad�n�n �ekti�i ac� ger�ektir ama erke�in ac�s� fazlad�r");
			document.write(fos);
			System.out.println("Yazma i�lemi tamamland�!!!");
			
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
