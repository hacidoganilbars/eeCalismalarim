package com.hacidoganilbars.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class CreateTable {
	public static void main(String[] args) {
		XWPFDocument document = new XWPFDocument();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File("C://asdf/tablecreate.docx"));
			XWPFTable table = document.createTable();

			XWPFTableRow tableRowOne = table.getRow(0);
			tableRowOne.getCell(0).setText("col one, row one");
			tableRowOne.addNewTableCell().setText("col two, row one");
			tableRowOne.addNewTableCell().setText("col three, row one");
			tableRowOne.addNewTableCell().setText("col four, row one");

			XWPFTableRow tableRowTwo = table.createRow();
			tableRowTwo.getCell(0).setText("col one, row two");
			tableRowTwo.getCell(1).setText("col two, row two");
			tableRowTwo.getCell(2).setText("col tree, row two");

			XWPFTableRow tableRowTree = table.createRow();
			tableRowTree.getCell(0).setText("col one, row tree");
			tableRowTree.getCell(1).setText("col two, row tree");
			tableRowTree.getCell(2).setText("col tree, row tree");
			tableRowTree.getCell(3).setText("col four, row tree");

			document.write(fos);
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
