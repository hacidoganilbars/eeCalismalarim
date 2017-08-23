package com.hacidoganilbars.pdfokuyaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDFdeneme {

	public void yazPDF(String path, String yazilacak) {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(new File(path)));
			document.open(); // açýldý
			Font font = new Font();
			font.setStyle(Font.BOLD);
			font.setSize(8);
			document.add(new Paragraph(yazilacak, font));
			
//			Paragraph p1=new Paragraph();
//			p1.add(yazilacak);
//			p1.setAlignment(Element.ALIGN_CENTER);
//			document.add(p1);
//			
//			Paragraph p2=new Paragraph();
//			p2.add(yazilacak);
//			document.add(p2);
			
			document.close();
			System.out.println("Done!!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}
	
	public void okuPDF(String path) {
		PdfReader reader;
		try {
			reader=new PdfReader(path);
			String textFromPage=PdfTextExtractor.getTextFromPage(reader, 1);
			System.out.println(textFromPage);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
