package com.hacidoganilbars.okumayazma;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFdeneme {

	public void readPdfFile(String path) {
		try {
			PDDocument document = null;
			document = PDDocument.load(new File(path));
			document.getClass();
			if (!document.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);
				PDFTextStripper Tstripper = new PDFTextStripper();
				String st = Tstripper.getText(document);
				System.out.println(st);
				JOptionPane.showMessageDialog(null, st);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createPdfFile(String path) {

		// Creating PDF document object
		PDDocument document = new PDDocument();

		PDPage page;
		document.addPage(new PDPage());

		// creating PDF Page
		// for (int i = 0; i < 10; i++) {
		// page=new PDPage();
		// document.addPage(page);
		// }
		System.out.println("Sayfalar eklendi");

		// Saving the document
		try {
			document.save(path);
			document.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("PDF created");

		// Closing the document
	}

	public void writePdfFile(String path, String text) {
		PDDocument document;
		File file;
		try {
			file = new File(path);
			document = PDDocument.load(file);
			PDPage page = document.getPage(0);
			PDPageContentStream streamPage = new PDPageContentStream(document, page);
			streamPage.beginText();
			streamPage.setFont(PDType1Font.TIMES_BOLD_ITALIC, 12);
			streamPage.newLineAtOffset(25, 500);
			streamPage.showText(text);
			streamPage.endText();
			streamPage.close();
			document.save(path);
			document.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
