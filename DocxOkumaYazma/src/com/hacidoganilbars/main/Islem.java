package com.hacidoganilbars.main;

import com.hacidoganilbars.wordokuyaz.Docx;

public class Islem {

	public static void main(String[] args) {
		String path="C:/ilbars/dogan.docx";
		String girdi="\nÞu kopan fýrtýna Türk ordusudur ya Rabbi,\r\n" + 
				"Senin uðrunda ölen ordu budur ya Rabbi,\r\n" + 
				"Ta ki, yükselen ezanlarla müeyyed namýn\r\n" + 
				"Galib et, çünkü bu son ordusudur Ýslamýn.";
		
		Docx docx=new Docx();	
		docx.yazDocx(path,girdi);
//		docx.okuDocx(path);
		
	}
}
