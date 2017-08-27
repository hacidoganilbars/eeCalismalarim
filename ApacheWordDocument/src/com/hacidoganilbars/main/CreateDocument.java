package com.hacidoganilbars.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class CreateDocument {
	public static void main(String[] args) {

		XWPFDocument document = new XWPFDocument();
		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream(new File("C://asdf/createdocument.docx"));
			document.write(fos);
			System.out.println("createdocument.docx olusturuldu!!");
			
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
