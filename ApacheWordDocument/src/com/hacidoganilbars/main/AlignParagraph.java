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
			run.setText("“Her gün ayný saatte gelmelisin” dedi tilki."
					+ " “Örneðin öðleden sonra saat dörtte gelirsen, ben saat üçte"
					+ " kendimi mutlu hissetmeye baþlarým. Zaman ilerledikçe de daha"
					+ " mutlu olurum. Saat dörtte endiþelenmeye ve üzülmeye baþlarým. "
					+ "Mutluluðun bedelini öðrenirim. Ama günün herhangi bir vaktinde "
					+ "gelirsen, seni karþýlamaya hazýrlanacaðým zamaný asla bilemem..");
			
			paragraf=document.createParagraph();
			paragraf.setAlignment(ParagraphAlignment.CENTER);
			run=paragraf.createRun();
			run.setText("Sürekli deðiþmek geliþmek isterim ama " + 
					"Mutlu olamam deðiþirsem, " + 
					"Salt sizin bencilliðinizi doyurmak için " + 
					"Hoþnut da olamam eleþtirdiðinizde beni " + 
					"Sizin gibi düþünmediðim " + 
					"Ya da görmediðim için sizin gibi... " + 
					"'Uyumsuz' diyorsunuz bana. " + 
					"Oysa inançlarýnýza her karþý çýkýþýmda, " + 
					"Siz de benimkilere karþý çýkýyorsunuz... " + 
					"Ben aklýnýzý biçimlendirmeye çalýþmýyorum ki... " + 
					"Kendinizi bulma savaþý veriyorsunuz " + 
					"Biliyorum ve anlýyorum sizi; " + 
					"Ama ne yönetmenizi isterim beni, " + 
					"Ne de akýl vermenizi kabul ederim. " + 
					"Çünkü kendimi bulma çabasýndayým ben de... " + 
					"Çünkü ben yalnýzca bana benzerim... " + 
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
