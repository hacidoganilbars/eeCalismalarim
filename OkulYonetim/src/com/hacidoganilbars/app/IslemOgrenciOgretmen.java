package com.hacidoganilbars.app;

import java.util.Arrays;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Ogrenci;
import com.hacidoganilbars.entity.Ogretmen;

public class IslemOgrenciOgretmen {
	public static void main(String[] args) {
		DAO dao=new DAO();
		dao.connection();
		
	
		
		
		Ogrenci hakan=new Ogrenci();
		hakan.setIsim("Hakan");
		hakan.setSoyIsim("Ceylan");
		hakan.setSinifi("10/A");
		dao.save(hakan);
		
		
		Ogrenci dogan=new Ogrenci();
		dogan.setIsim("Doðan");
		dogan.setSoyIsim("Ýlbars");
		dogan.setSinifi("10/B");
		dao.save(dogan);
		
		
		Ogretmen fahriye=new Ogretmen();
		fahriye.setIsim("Fahriye");
		fahriye.setSoyIsim("Seyhanlý");
		fahriye.setBrans("Sýnýf");
		
		
		Ogretmen mustafa=new Ogretmen();
		mustafa.setIsim("Mustafa");
		mustafa.setSoyIsim("Ergan");
		mustafa.setBrans("Java Programlama");
	
	
		
		mustafa.setOgrenciList(Arrays.asList(hakan,dogan));
		fahriye.setOgrenciList(Arrays.asList(dogan));
		dao.save(mustafa);
		dao.save(fahriye);
		
		
	}

}
