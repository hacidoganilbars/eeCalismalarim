package com.hacidoganilbars.app;

import java.util.Arrays;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Mudur;
import com.hacidoganilbars.entity.Ogrenci;

public class IslemMudurOgrenci {
	
	public static void main(String[] args) {
		DAO dao=new DAO();
		dao.connection();
		
		Ogrenci haci=new Ogrenci();
		haci.setIsim("Hacý");
		haci.setSoyIsim("Ýlbars");
		haci.setSinifi("10/A");
	
		
		Ogrenci ali=new Ogrenci();
		ali.setIsim("Ali");
		ali.setSoyIsim("Veli");
		ali.setSinifi("9/B");
		
		
		Mudur niyazi=new Mudur();
		niyazi.setIsim("Niyazi");
		niyazi.setSoyIsim("Ayna");
		dao.save(niyazi);
		ali.setMudur(niyazi);
		dao.save(ali);
		haci.setMudur(niyazi);
		dao.save(haci);
		niyazi.setOgrenciList(Arrays.asList(haci,ali));
		dao.save(niyazi);
		

	}
	
	

}
