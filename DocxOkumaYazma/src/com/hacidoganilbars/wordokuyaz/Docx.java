package com.hacidoganilbars.wordokuyaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Docx {

	public void yazDocx(String dosyaYolu, String girilen) {

		try {
			FileOutputStream out = new FileOutputStream(dosyaYolu);
			XWPFDocument document = new XWPFDocument();
			XWPFParagraph paragraph = document.createParagraph();
			XWPFRun run = paragraph.createRun();
			run.setText(girilen);
			document.write(out);
			System.out.println("yazma iþlemi tamamlandý");
			out.close();
			okuDocx(dosyaYolu);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void okuDocx(String dosyaYolu) {
		try {
			File file = new File(dosyaYolu);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());

			XWPFDocument belge = new XWPFDocument(fis);

			List<XWPFParagraph> paragraf = belge.getParagraphs();

			for (XWPFParagraph para : paragraf) {
				System.out.println(para.getText());
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
