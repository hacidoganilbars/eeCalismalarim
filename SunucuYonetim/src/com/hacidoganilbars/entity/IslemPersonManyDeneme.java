package com.hacidoganilbars.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class IslemPersonManyDeneme {
	public static void main(String[] args) {
		
		DAO dao=new DAO();
		dao.connection();
		
		
		Adres adresHaci =new Adres();
		adresHaci.setName("Akasya Cad 28/6");
		dao.save(adresHaci);
		Person haci=new Person();
		haci.setName("Hacý");
		haci.setAdres(adresHaci);
		dao.save(haci);
		
		Adres adresDogan=new Adres();
		adresDogan.setName("Kanuni Mah 858sk no:10/3");
		dao.save(adresDogan);
		Person dogan=new Person();
		dogan.setAdres(adresDogan);
		dogan.setName("Doðan");
		dao.save(dogan);
		
		
		Yonetici mustafa=new Yonetici();
		mustafa.setName("Mustafa");
		mustafa.setPersonList(Arrays.asList(haci,dogan));
		dao.save(mustafa);
	}

}
