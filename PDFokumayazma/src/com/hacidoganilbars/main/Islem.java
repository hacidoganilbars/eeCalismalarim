package com.hacidoganilbars.main;

import com.hacidoganilbars.pdfokuyaz.PDFdeneme;

public class Islem {

	public static void main(String[] args) {
		String path = "C:/ilbars/abc.pdf";
		String yazilacak = "'Dönülmez akþamýn ufkundayýz vakit çok geç\r\n"
				+ "Bu son fasýldýr ey ömrüm nasýlgeçersen geç\r\n" + "Cihâna bir daha gelmek hayâl edilse bile\r\n"
				+ "Avunmak istemeyiz böyle bir teselliyle\r\n" + "Geniþ kanatlarý boþlukta simsiyah açýlan\r\n"
				+ "ve arkasýnda güneþ doðmayan büyük kapýdan\r\n" + "Geçince baþlayacak bitmeyen sükûnlu gece\r\n"
				+ "Guruba karþý bu son bahçelerde keyfince\r\n" + "Ya þevk içinde harap ol ya aþk içinde gönül\r\n"
				+ "Ya lale açmalýdýr göðsümüzde yahut gül'..Yahya Kemal Beyatlý";

		PDFdeneme pdf = new PDFdeneme();
		pdf.yazPDF(path, yazilacak);
		pdf.okuPDF(path);

	}
}
