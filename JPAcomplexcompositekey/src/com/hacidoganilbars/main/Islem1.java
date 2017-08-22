package com.hacidoganilbars.main;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Araba;
import com.hacidoganilbars.entity.Ruhsat1;

public class Islem1 {

	public static void main(String[] args) {
		
		DAO dao=new DAO();
		dao.connection();
		
		
		Araba araba2=new Araba();
		araba2.setMarka("Hacý Murat");
		araba2.setModel("mrt");
		dao.save(araba2);
		
		Ruhsat1 ruhsat1=new Ruhsat1();
		ruhsat1.setRuhsatNo("1ruhsat1");
		ruhsat1.setArabaObj(araba2);
		dao.save(ruhsat1);
	}
}
