package com.hacidoganilbars.main;

import com.hacidoganilbars.okumayazma.PDFdeneme;

public class Islem {
	public static void main(String[] args) {
		String path = "C:/ilbars/hdi.pdf";
		String text = "Donulmez aksamin ufkundayiz vakit cok gec";
		PDFdeneme pdf = new PDFdeneme();
		// pdf.createPdfFile(path);
		// pdf.writePdfFile(path, text);
		pdf.readPdfFile(path);

	}

}
