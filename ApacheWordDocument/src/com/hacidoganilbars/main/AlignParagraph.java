package com.hacidoganilbars.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class AlignParagraph {

	public static void main(String[] args) {
		XWPFDocument document=new XWPFDocument();
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(new File("C://asdf/alignparagraph.docx"));
			
			XWPFParagraph paragraf=document.createParagraph();
			paragraf.setAlignment(ParagraphAlignment.RIGHT);
			XWPFRun run=paragraf.createRun();
			run.setText("�Her g�n ayn� saatte gelmelisin� dedi tilki."
					+ " ��rne�in ��leden sonra saat d�rtte gelirsen, ben saat ��te"
					+ " kendimi mutlu hissetmeye ba�lar�m. Zaman ilerledik�e de daha"
					+ " mutlu olurum. Saat d�rtte endi�elenmeye ve �z�lmeye ba�lar�m. "
					+ "Mutlulu�un bedelini ��renirim. Ama g�n�n herhangi bir vaktinde "
					+ "gelirsen, seni kar��lamaya haz�rlanaca��m zaman� asla bilemem..");
			
			paragraf=document.createParagraph();
			paragraf.setAlignment(ParagraphAlignment.CENTER);
			run=paragraf.createRun();
			run.setText("S�rekli de�i�mek geli�mek isterim ama " + 
					"Mutlu olamam de�i�irsem, " + 
					"Salt sizin bencilli�inizi doyurmak i�in " + 
					"Ho�nut da olamam ele�tirdi�inizde beni " + 
					"Sizin gibi d���nmedi�im " + 
					"Ya da g�rmedi�im i�in sizin gibi... " + 
					"'Uyumsuz' diyorsunuz bana. " + 
					"Oysa inan�lar�n�za her kar�� ��k���mda, " + 
					"Siz de benimkilere kar�� ��k�yorsunuz... " + 
					"Ben akl�n�z� bi�imlendirmeye �al��m�yorum ki... " + 
					"Kendinizi bulma sava�� veriyorsunuz " + 
					"Biliyorum ve anl�yorum sizi; " + 
					"Ama ne y�netmenizi isterim beni, " + 
					"Ne de ak�l vermenizi kabul ederim. " + 
					"��nk� kendimi bulma �abas�nday�m ben de... " + 
					"��nk� ben yaln�zca bana benzerim... " + 
					" 'Leo Buscaglia'");
			
			document.write(fos);
			System.out.println("Yazma islemi tamamlandi!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
