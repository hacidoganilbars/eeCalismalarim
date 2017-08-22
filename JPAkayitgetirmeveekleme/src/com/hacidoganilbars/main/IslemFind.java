package com.hacidoganilbars.main;

import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Person;

public class IslemFind {
	public static void main(String[] args) {

		Person p;
		
		DAO dao = new DAO();
		dao.connect();
		
		p=dao.em.find(Person.class, 2);
		System.out.println(p.getId()+" "+p.getName()+" "+p.getSurname());
		
		dao.em.close();
		
	

	}

}
