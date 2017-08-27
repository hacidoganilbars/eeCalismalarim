package com.hacidoganilbars.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class ApplayingBorder {
	public static void main(String[] args) {
		XWPFDocument document=new XWPFDocument();
		FileOutputStream fos=null;
		try {
			 fos=new FileOutputStream(new File("C://asdf/appborder.docx"));
			 
			 XWPFParagraph paragraf=document.createParagraph();
			 paragraf.setBorderBottom(Borders.BASIC_BLACK_DASHES);
			 paragraf.setBorderLeft(Borders.BASIC_BLACK_DASHES);
			 paragraf.setBorderRight(Borders.BASIC_BLACK_DASHES);
			 paragraf.setBorderTop(Borders.BASIC_BLACK_DASHES);
			 
			 XWPFRun run=paragraf.createRun();
			 run.setText("��lg�nca bir korkunun tutsa��y�m Milena. Anl�yor musun"
			 		+ " korkuyorum? Bu koca satran� oyununda yerim yok benim zaten. "
			 		+ "�lgimi �ekmiyor, ben b�t�n dikkatimi krali�eye vermi�im�");
			 document.write(fos);
			 System.out.println("Yazma islemi tamamlandi!!!");
			 
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
