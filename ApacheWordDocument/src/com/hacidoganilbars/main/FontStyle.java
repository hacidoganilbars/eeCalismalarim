package com.hacidoganilbars.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class FontStyle {
	public static void main(String[] args) {

		XWPFDocument document = new XWPFDocument();
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(new File("C://asdf/fontstyle.docx"));
			XWPFParagraph paragraf = document.createParagraph();

			// Set Bold an Italic
			XWPFRun run1 = paragraf.createRun();
			run1.setBold(true);
			run1.setItalic(true);
			run1.setText("Font Style ONE");
			run1.addBreak();

			// Set text Position
			XWPFRun run2 = paragraf.createRun();
			run2.setText("Font Style TWO");
			run2.setTextPosition(100);

			// Set Strike through and Font Size and Subscript
			XWPFRun run3 = paragraf.createRun();
			run3.setStrike(true);
			run3.setFontSize(20);
			run3.setSubscript(VerticalAlign.SUBSCRIPT);
			run3.setText("Different Font Styles");

			document.write(fos);
			
			System.out.println("Yazma islemi tamamlandi!!!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
