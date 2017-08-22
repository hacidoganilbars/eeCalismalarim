package com.hacidoganilbars.main;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Person;

public class Islem {
	
	public static void main(String[] args) {
		DAO dao=new DAO();
		dao.connect();
		
		Person pers=new Person();
		pers.setName("Ricardo");
		pers.setSurname("Quaresma");
		dao.save(pers);
		
		Person pers1=new Person();
		pers1.setName("Ryan");
		pers1.setSurname("Babel");
		dao.save(pers1);
	}

}
