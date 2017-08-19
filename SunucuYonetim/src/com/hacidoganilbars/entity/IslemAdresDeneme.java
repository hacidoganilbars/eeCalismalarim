package com.hacidoganilbars.entity;

public class IslemAdresDeneme {
	public static void main(String[] args) {
		DAO dao=new DAO();
		dao.connection();
		
		Adres adres=new Adres();
		adres.setName("Ýstasyon Cad 28/6");
		dao.save(adres);
		
		Person haci=new Person();
		haci.setName("Hacý");
		haci.setAdres(adres);
		dao.save(haci);
		
	
	}

}
