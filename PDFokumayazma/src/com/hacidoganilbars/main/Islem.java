package com.hacidoganilbars.main;

import com.hacidoganilbars.pdfokuyaz.PDFdeneme;

public class Islem {

	public static void main(String[] args) {
		String path = "C:/ilbars/abc.pdf";
		String yazilacak = "'D�n�lmez ak�am�n ufkunday�z vakit �ok ge�\r\n"
				+ "Bu son fas�ld�r ey �mr�m nas�lge�ersen ge�\r\n" + "Cih�na bir daha gelmek hay�l edilse bile\r\n"
				+ "Avunmak istemeyiz b�yle bir teselliyle\r\n" + "Geni� kanatlar� bo�lukta simsiyah a��lan\r\n"
				+ "ve arkas�nda g�ne� do�mayan b�y�k kap�dan\r\n" + "Ge�ince ba�layacak bitmeyen s�k�nlu gece\r\n"
				+ "Guruba kar�� bu son bah�elerde keyfince\r\n" + "Ya �evk i�inde harap ol ya a�k i�inde g�n�l\r\n"
				+ "Ya lale a�mal�d�r g��s�m�zde yahut g�l'..Yahya Kemal Beyatl�";

		PDFdeneme pdf = new PDFdeneme();
		pdf.yazPDF(path, yazilacak);
		pdf.okuPDF(path);

	}
}
