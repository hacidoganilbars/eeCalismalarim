package com.hacidoganilbars.main;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Araba;
import com.hacidoganilbars.entity.Ruhsat;
import com.hacidoganilbars.entity.Ruhsat1;

public class Islem {
	
	public static void main(String[] args) {
		
		DAO dao=new DAO();
		dao.connection();
		
		Araba araba =new Araba();
		araba.setMarka("Porche");
		araba.setModel("şans");
		dao.save(araba);
		
		Ruhsat ruhsat=new Ruhsat();
		ruhsat.setRuhsatNo("123");
		ruhsat.setArabaObj(araba);
		dao.save(ruhsat);
		
		Araba araba1 =new Araba();
		araba1.setMarka("Doğan");
		araba1.setModel("slx");
		dao.save(araba1);
		
		
		Ruhsat ruhsata=new Ruhsat();
		ruhsata.setRuhsatNo("987");
		ruhsat.setArabaObj(araba1);
		dao.save(ruhsata);
	

		
	}

}
