package com.hacidoganilbars.main;

import com.hacidoganilbars.wordokuyaz.Docx;

public class Islem {

	public static void main(String[] args) {
		String path="C:/ilbars/dogan.docx";
		String girdi="\n�u kopan f�rt�na T�rk ordusudur ya Rabbi,\r\n" + 
				"Senin u�runda �len ordu budur ya Rabbi,\r\n" + 
				"Ta ki, y�kselen ezanlarla m�eyyed nam�n\r\n" + 
				"Galib et, ��nk� bu son ordusudur �slam�n.";
		
		Docx docx=new Docx();	
		docx.yazDocx(path,girdi);
//		docx.okuDocx(path);
		
	}
}
